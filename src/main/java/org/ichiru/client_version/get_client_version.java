package org.ichiru.client_version;

import com.viaversion.viaversion.api.ViaAPI;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import com.viaversion.viaversion.api.Via;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class get_client_version extends PlaceholderExpansion{
    private final JavaPlugin plugin;
    ViaAPI viaAPI = Via.getAPI();

    public get_client_version(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public @NotNull String getIdentifier() {
        return "client";
    }

    @Override
    public @NotNull String getAuthor() {
        return plugin.getDescription().getAuthors().toString();
    }

    @Override
    public @NotNull String getVersion() {
        return plugin.getDescription().getVersion();
    }

    @Override
    public boolean persist() {
        return true;
    }

    @Override
    public String onPlaceholderRequest(Player player, @NotNull String identifier) {
        if (player == null) {
            return "";
        }

        if (identifier.equals("version")) {
            return getVersionName.main(viaAPI.getPlayerVersion(player));
        }
        return null;
    }
}
