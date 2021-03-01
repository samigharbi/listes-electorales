package gouv.mtes.listeselectorales.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import gouv.mtes.listeselectorales.models.Agent;

public interface AgentRepository extends JpaRepository<Agent, Long> {

}
