package engine.core;

import engine.components.EntityRenderComponent;
import engine.gfx.Sprite;

public abstract class Entity extends GameObject {

    private Sprite m_Texture;

    public Entity(Transform transform, Sprite texture) {
        super(transform);
        this.m_Texture = texture;
        AddComponent(new EntityRenderComponent(texture));
    }

    public Sprite GetSprite() {
        return m_Texture;
    }
}
