package io.redis.jedis.jedisdemo.service;

import io.redis.jedis.jedisdemo.entity.Programmer;
import io.redis.jedis.jedisdemo.mapper.ProgrammerRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class ProgrammerServiceImpl implements ProgrammerService {
    private ProgrammerRepo repo;

    public ProgrammerServiceImpl(ProgrammerRepo repo) {
        this.repo = repo;
    }

    @Override
    public void setProgrammerAsString(String idKey, String programmer) {
        repo.setProgrammerAsString(idKey, programmer);
    }

    @Override
    public String getProgrammerAsString(String key) {
        return repo.getProgrammerAsString(key);
    }

    @Override
    public void AddToProgrammerList(Programmer programmer) {
        repo.AddToProgrammersList(programmer);
    }

    @Override
    public List<Programmer> getProgrammerListMembers() {
        return repo.getProgrammersListMembers();
    }

    @Override
    public Long getProgrammersListCount() {
        return repo.getProgrammersListCount();
    }

    @Override
    public void AddToProgrammersSet(Programmer... programmers) {
        repo.AddToProgrammersSet(programmers);
    }

    @Override
    public Set<Programmer> getProgrammersSetMembers() {
        return repo.getProgrammersSetMembers();
    }

    @Override
    public boolean isSetMember(Programmer programmer) {
        return repo.isSetMember(programmer);
    }

    @Override
    public void savePHash(Programmer programmer) {
        repo.saveHash(programmer);
    }

    @Override
    public void updatePHash(Programmer programmer) {
        repo.updateHash(programmer);
    }

    @Override
    public Map<Integer, Programmer> findAllPHash() {
        return repo.findAllHash();
    }

    @Override
    public Programmer findPInHash(int id) {
        return repo.findInHash(id);
    }

    @Override
    public void deletePHash(int id) {
        repo.deleteHash(id);
    }
}
