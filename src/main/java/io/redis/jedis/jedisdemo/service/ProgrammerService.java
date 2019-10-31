package io.redis.jedis.jedisdemo.service;

import io.redis.jedis.jedisdemo.entity.Programmer;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface ProgrammerService {
    void setProgrammerAsString(String idKey, String programmer);

    String getProgrammerAsString(String key);

    void AddToProgrammerList(Programmer programmer);

    List<Programmer> getProgrammerListMembers();

    Long getProgrammersListCount();

    void AddToProgrammersSet(Programmer... programmers);

    Set<Programmer> getProgrammersSetMembers();

    boolean isSetMember(Programmer programmer);

    void savePHash(Programmer programmer);

    void updatePHash(Programmer programmer);

    Map<Integer, Programmer> findAllPHash();

    Programmer findPInHash(int id);

    void deletePHash(int id);
}
