package com.exercici0305;

import java.util.ArrayList;

public class Torneig {

    private final ArrayList<Participant> participants;

    public Torneig() {
        participants = new ArrayList<>();
    }

    public void afegirParticipant(Participant p) {
        participants.add(p);
        }

        public void competir() {
        for (Participant p : participants) {
            p.competir();
        }
        }

        public void entrenar() {
        for (Participant p : participants) {
            p.entrenar();
        }
        }

        public ArrayList<Participant> getParticipants() {
        return participants;
    }

    public void printParticipants() {
        for (Participant p : participants) {
            System.out.println(p);
        }
    }
}
