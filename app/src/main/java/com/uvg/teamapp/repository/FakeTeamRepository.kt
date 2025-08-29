package com.uvg.teamapp.repository;

import com.uvg.teamapp.model.TeamMember;

class FakeTeamRepository {
    fun getTeamMembers(): List<TeamMember> {
        return listOf(
                TeamMember("Josue Hernández", "Desarrollador Android"),
                TeamMember("Sergio Tan", "Desarrollador Android"),
                TeamMember("Jackelyn Girón", "Desarrolladora de Vistas")
        )
    }
}
