package sandbox.entity;

import engine.components.CollisionComponent;
import engine.core.entity.Entity;
import engine.core.Transform;
import engine.core.entity.SimpleEntity;
import engine.gfx.Sprite;
import sandbox.Textures;

/**Create a entity from a template class called {@class SimpleEntity}*/
public class EntityPlayer extends SimpleEntity {

    public EntityPlayer() {
        super(new Transform(), Textures.PLAYER, "player");
        AddComponent(new CollisionComponent(
                m_Transform.GetX(),
                m_Transform.GetY(),
                m_Transform.GetX() * m_Transform.GetSize().x,
                m_Transform.GetY() * m_Transform.GetSize().y));
    }

}
