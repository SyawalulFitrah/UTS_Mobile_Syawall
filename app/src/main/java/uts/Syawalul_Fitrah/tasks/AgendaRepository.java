package uts.Syawalul_Fitrah.tasks;

import android.content.Context;

import java.util.List;

public class AgendaRepository {
    private AgendaDAO agendaDAO;

    public AgendaRepository(Context context) {
        agendaDAO = new AgendaDAO(context);
    }

    public long addAgenda(Agenda agenda) {
        return agendaDAO.addAgenda(agenda);
    }

    public List<Agenda> getAllAgendas() {
        return agendaDAO.getAllAgendas();
    }

    public void deleteAgenda(int id) {
        agendaDAO.deleteAgenda(id);
    }
}