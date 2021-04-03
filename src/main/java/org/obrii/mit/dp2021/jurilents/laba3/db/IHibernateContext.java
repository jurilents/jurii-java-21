package org.obrii.mit.dp2021.jurilents.laba3.db;

import org.springframework.data.repository.CrudRepository;

public interface IHibernateContext<TData> extends CrudRepository<TData, Integer> {
}
