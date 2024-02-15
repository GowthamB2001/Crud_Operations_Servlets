package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.DTO;

public class DAO {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager m = emf.createEntityManager();
	EntityTransaction t = m.getTransaction();

	public void insert(DTO f) {

		t.begin();
		m.persist(f);
		t.commit();

	}

	public String delete(int cid) {
		DTO f1 = m.find(DTO.class, cid);
		if (f1 != null) {
			t.begin();
			m.remove(f1);
			t.commit();
			return "data deleted succesfully";
		} else
			return "no data founded";
	}

	public Object fetchall(int fid) {
		DTO f2 = m.find(DTO.class, fid);
		if (f2 != null) {
			return f2;
		} else {
			return "Enter the valid number";
		}

	}

	public List<DTO> fetchalls() {
		Query g = m.createQuery("Select a  from DTO a");
		List<DTO> l = g.getResultList();
		return l;
	}

	public String deleteall() {
		Query d = m.createQuery("Select a from DTO a");
		List<DTO> d1 = d.getResultList();
		if (d1.isEmpty()) {
			return "no data found";
		} else {
			for (DTO a : d1) {
				t.begin();
				m.remove(a);
				t.commit();
			}
			return "data deleted";
		}

	}
	public void updateAll(DTO e1) {
		DTO e = m.find(DTO.class, e1.getId());
		e.setName(e1.getName());

		
	}
}
