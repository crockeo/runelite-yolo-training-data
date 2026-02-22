package net.crockeo;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class YoloTrainingDataTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(YoloTrainingData.class);
		RuneLite.main(args);
	}
}