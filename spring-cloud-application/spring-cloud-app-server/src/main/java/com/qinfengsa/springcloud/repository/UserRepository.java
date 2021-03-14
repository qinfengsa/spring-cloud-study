package com.qinfengsa.springcloud.repository;

import com.qinfengsa.springcloud.domain.User;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Repository;

/**
 * @author qinfengsa
 * @date 2021/03/14 11:24
 */
@Repository
public class UserRepository {

    // user存储
    private Map<Long, User> repository = new ConcurrentHashMap<>();

    // id生成
    private static final AtomicLong idGenerator = new AtomicLong(0);

    public Collection<User> findAll() {
        return repository.values();
    }

    public Optional<User> save(User user) {
        Long id = idGenerator.incrementAndGet();
        user.setId(id);
        return Optional.of(repository.computeIfAbsent(id, k -> user));
    }
}
