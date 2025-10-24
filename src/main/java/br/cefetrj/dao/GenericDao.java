package br.cefetrj.dao;

import java.util.ArrayList;
import java.util.List;

import br.cefetrj.model.Entidade;
import br.cefetrj.utils.HibernateUtil;
import jakarta.persistence.EntityManager;

public class GenericDao<T extends Entidade>  {
    private final Class<T> class1;

    public GenericDao(Class<T> class1) {
        this.class1 = class1;
    }

    public void adicionar(T entidade) {
        EntityManager entityManager = HibernateUtil.getEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(entidade);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            if (entityManager.getTransaction().isActive())
                entityManager.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public void atualizar(T entidade) {
        EntityManager entityManager = HibernateUtil.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(entidade);
        entityManager.getTransaction().commit();

    }

    public void deletar(int id) {

        EntityManager entityManager = HibernateUtil.getEntityManager();
        entityManager.getTransaction().begin();
        T class2 = entityManager.find(class1, id);
        if (class2 != null) {
            entityManager.remove(class2); // antes: delete()
        }
        entityManager.getTransaction().commit();

    }

    public T buscarPorId(int id) {
        try (EntityManager entityManager = HibernateUtil.getEntityManager()) {
            return entityManager.find(class1, id);
        }
    }

    public List<T> listarTodos() {
        try (EntityManager entityManager = HibernateUtil.getEntityManager()) {
            return entityManager.createQuery("from " + class1.getSimpleName(), class1)
                    .getResultList();
        }
    }
}
