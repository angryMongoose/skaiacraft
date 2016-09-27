package com.github.angrymongoose.skaiacraft;

import com.github.angrymongoose.skaiacraft.help.Reference;

import net.minecraftforge.fml.common.Mod;

@Mod (modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)

public class Skaiacraft {

@Mod.EventHandler
public void preInit(FMLInitializationEvent event)
{
	
}

@Mod.EventHandler
public void init(FMLInitializationEvent event)
{
	
}

@Mod.EventHandler
public void postInit(FMLInitializationEvent event)
{
	
}}

@SidedProxy (clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
public static CommonProxy proxy;

@Instance(Reference.MODID)
public static Skaiacraft instance;