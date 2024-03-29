package com.matsu.projetoscheduler.business;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Slf4j
public class AgendamentoService {

    @Scheduled(cron = "${spring.task.scheduling.cron}")
    public void AgendaTarefas(){
        log.info("Agendado e executado em {}", LocalDateTime.now());
    }
}
