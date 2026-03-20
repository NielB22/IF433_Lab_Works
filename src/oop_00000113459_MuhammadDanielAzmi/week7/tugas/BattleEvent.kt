package oop_00000113459_MuhammadDanielAzmi.week7.tugas

sealed class BattleState {
    data class MonsterEncounter(val monsterName: String) : BattleState()
    data class LootDropped(val item: GameItem) : BattleState()
    data class GameOver(val reason: String) : BattleState()
    object SaveZone : BattleState()
}