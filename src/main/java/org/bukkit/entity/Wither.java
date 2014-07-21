package org.bukkit.entity;

import org.bukkit.Location;

/**
 * Represents a Wither boss.
 */
public interface Wither extends Monster {

    /**
     * Gets the current target of a wither head.
     *
     * @param head which head to check the target of
     * @return the current target of a wither head, or null if none
     */
    public LivingEntity getTarget(WitherHead head);

    /**
     * Sets the current target of a wither head.
     * <br />
     * Please note, the center head is the main head and if it has a target, then it will overwrite the targets of the other heads.
     * The left and right heads will only act independently if the center head has no target.
     * This vanilla behavior can obviously be overridden using the {@link org.bukkit.event.entity.WitherHeadTargetEvent} event.
     *
     * @param head which head to check the target of
     * @param entity the entity to set as the target
     */
    public void setTarget(WitherHead head, LivingEntity entity);

    /**
     * Fires a wither skull from a wither head.
     *
     * @param head which head to fire from
     * @param entity the entity to fire at
     * @return the wither skull that was shot
     */
    public WitherSkull shoot(WitherHead head, LivingEntity entity);

    /**
     * Fires a wither skull from a wither head.
     *
     * @param head which head to fire from
     * @param location the location to fire at
     * @return the wither skull that was shot
     */
    public WitherSkull shoot(WitherHead head, Location location);

    /**
     * An enum to specify a head on the Wither.
     */
    public enum WitherHead {

        /**
         * The Left head in respect to a frontal view.
         */
        LEFT(1),

        /**
         * The Center head in respect to a frontal view.
         */
        CENTER(0),

        /**
         * The Right head in respect to a frontal view.
         */
        RIGHT(2);

        private int id;

        private WitherHead(int id){
            this.id = id;
        }

        /**
         * Gets the head id of this WitherHead.
         *
         * @return ID of this WitherHead
         * @deprecated Magic value
         */
        @Deprecated
        public int getId() {
            return id;
        }

        /**
         * Attempts to get a wither head by it's given ID.
         *
         * @param id ID of the wither head to get
         * @return Wither head if found, else null
         * @deprecated Magic value
         */
        @Deprecated
        public static WitherHead getWitherHead(int id){
            for (WitherHead witherHead : values()){
                if (witherHead.getId() == id){
                    return witherHead;
                }
            }

            return null;
        }
    }
}
