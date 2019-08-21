package com.example.demo.repository;

import java.util.Optional;

import com.example.demo.person.book;

public class StubBookRepository implements bookRepository {

	@Override
	public <S extends book> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends book> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<book> findById(Integer id) {
		// TODO Auto-generated method stub
		Optional<book> op=Optional.empty();
		//return op.of());
		book b=new book();
		b.setId(id);
		b.setName("Abhishek");
		b.setPrice(1723);
		return op.of(b);
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<book> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<book> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(book entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends book> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}
