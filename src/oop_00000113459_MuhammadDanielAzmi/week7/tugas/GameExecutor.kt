package oop_00000113459_MuhammadDanielAzmi.week7.tugas

fun processEvent(event: BattleState) {

    when(event){
        is BattleState.MonsterEncounter -> {
            println("Monster muncul : ${event.monsterName}")
        }

        is BattleState.LootDropped -> {
            println("Loot           : ${event.item}")
        }

        is BattleState.GameOver -> {
            println("Game over      : ${event.reason}")
        }

        is BattleState.SaveZone -> {
            println("Masuk zona aman (save)")
        }
    }
}