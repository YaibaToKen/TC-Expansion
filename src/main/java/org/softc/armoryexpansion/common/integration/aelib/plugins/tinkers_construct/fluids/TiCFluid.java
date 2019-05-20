package org.softc.armoryexpansion.common.integration.aelib.plugins.tinkers_construct.fluids;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

public class TiCFluid extends Fluid {


    public TiCFluid(String name, int color) {
        this(name);
        this.color = color;
    }

    private TiCFluid(String name) {
        super(
                "molten_" + name,
                new ResourceLocation("tconstruct:blocks/fluids/molten_metal"),
                new ResourceLocation("tconstruct:blocks/fluids/molten_metal_flow"));
        this.setUnlocalizedName(this.getName());
        this.setViscosity(6000);
        this.setLuminosity(15);
        this.setTemperature(2000);
    }

    @Override
    public int getColor(){
        return this.color;
    }
}