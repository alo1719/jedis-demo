package io.redis.jedis.jedisdemo.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.redis.jedis.jedisdemo.entity.Programmer;
import io.redis.jedis.jedisdemo.service.ProgrammerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class ProgrammerController {
    private ProgrammerService service;

    public ProgrammerController(ProgrammerService service) {
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/programmer-string")
    public void addProgrammer(@RequestBody Programmer programmer) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        service.setProgrammerAsString(String.valueOf(programmer.getId()), mapper.writeValueAsString(programmer));
    }

    @RequestMapping("programmer-string/{id}")
    public String readProgrammer(@PathVariable String id) {
        return service.getProgrammerAsString(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/programmers-list")
    public void addToProgrammerList(@RequestBody Programmer programmer) {
        service.AddToProgrammerList(programmer);
    }

    @RequestMapping("/programmers-list")
    public List<Programmer> getProgrammerListMembers() {
        return service.getProgrammerListMembers();
    }

    @RequestMapping("/programmers-list/count")
    public Long getProgrammerListCount() {
        return service.getProgrammersListCount();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/programmers-hash")
    public void savePHash(@RequestBody Programmer programmer) {
        service.savePHash(programmer);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/programmers-hash")
    public void updatePHash(@RequestBody Programmer programmer) {
        service.updatePHash(programmer);
    }

    @RequestMapping("programmers-hash")
    public Map<Integer, Programmer> findAllPHash() {
        return service.findAllPHash();
    }

    @RequestMapping("/programmers-hash/{id}")
    public Programmer FindPInHash(@PathVariable int id) {
        return service.findPInHash(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/programmers-hash/{id}")
    public void deletePHash(@PathVariable int id) {
        service.deletePHash(id);
    }
}
