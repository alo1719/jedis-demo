package io.redis.jedis.jedisdemo.mapper;

import io.redis.jedis.jedisdemo.entity.Programmer;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface ProgrammerRepo {
    void setProgrammerAsString(String idKey, String programmer);

    String getProgrammerAsString(String idKey);

    void AddToProgrammersList(Programmer programmer);

    List<Programmer> getProgrammersListMembers();

    Long getProgrammersListCount();

    void AddToProgrammersSet(Programmer... programmers);

    Set<Programmer> getProgrammersSetMembers();

    boolean isSetMember(Programmer programmer);

    void saveHash(Programmer programmer);

    void updateHash(Programmer programmer);

    Map<Integer, Programmer> findAllHash();

    Programmer findInHash(int id);

    void deleteHash(int id);
}
