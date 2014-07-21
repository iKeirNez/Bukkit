package org.bukkit.event.entity;

import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Wither;
import org.bukkit.entity.Wither.WitherHead;
import org.bukkit.event.Cancellable;

/**
 * Called when a wither head targets or un-targets an entity for its wither
 * skull attack.
 */
public class WitherHeadTargetEvent extends EntityTargetLivingEntityEvent implements Cancellable {

    private WitherHead witherHead;

    public WitherHeadTargetEvent(Wither entity, LivingEntity target, TargetReason reason, WitherHead witherHead) {
        super(entity, target, reason);
        this.witherHead = witherHead;
    }

    /**
     * Gets which head of the wither is targeting an entity.
     *
     * @return Which wither head is targeting an entity
     */
    public WitherHead getWitherHead() {
        return witherHead;
    }

    /**
     * Sets the head which should have its target modified.
     *
     * @param witherHead the head which should have its target modified
     */
    public void setWitherHead(WitherHead witherHead){
        this.witherHead = witherHead;
    }

    @Override
    public Wither getEntity() {
        return (Wither) super.getEntity();
    }

}
