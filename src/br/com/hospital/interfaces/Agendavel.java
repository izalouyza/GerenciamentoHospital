package br.com.hospital.interfaces;

public interface Agendavel {
    void agendar(String dataHora);

    void cancelarAgendamento();

    String getDataHora();

    String getResumoAgendamento();
}
