package fr.theobosse.shotcaveapi.event.enums;

public enum DamageReason {
    MELEE,
    /**
     * Melee damage from a non-melee type weapon
     */
    MELEE_WEAK,
    /**
     * Damage from a raycast gun
     */
    RAYCAST,
    FIRE,
    EXPLOSION,
    NATURAL,
    FROST,
    NONPLAYER,
    PROJECTILE,
    POISON,
    UNKNOWN
}


