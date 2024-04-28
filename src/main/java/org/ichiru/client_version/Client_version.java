package org.ichiru.client_version;

import org.bukkit.plugin.java.JavaPlugin;

public final class Client_version extends JavaPlugin{
    @Override
    public void onEnable() {
        new get_client_version(this).register();
    }
}
