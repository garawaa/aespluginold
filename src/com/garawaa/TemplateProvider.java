package com.garawaa;


import com.intellij.codeInsight.template.impl.DefaultLiveTemplatesProvider;
import org.jetbrains.annotations.*;

public class TemplateProvider implements DefaultLiveTemplatesProvider {
    @Override
    public String[] getDefaultLiveTemplateFiles() {


        return new String[]{



                "liveTemplates/aes_bluetooth",
                "liveTemplates/aes_dialogs",
                "liveTemplates/aes_face_recognition",
                "liveTemplates/aes_fragment",
                "liveTemplates/aes_general",
                "liveTemplates/aes_gps",
                "liveTemplates/aes_intents",
                "liveTemplates/aes_localization",
                "liveTemplates/aes_log",
                "liveTemplates/aes_media",
                "liveTemplates/aes_menus_and_actionbar",
                "liveTemplates/aes_preferences",
                "liveTemplates/aes_resources_and_assets",
                "liveTemplates/aes_screen",
                "liveTemplates/aes_sensors",
                "liveTemplates/aes_sql_commands",
                "liveTemplates/aes_sqlite_functions",
                "liveTemplates/aes_system_services",
                "liveTemplates/aes_ui",
                "liveTemplates/aes_web_services"






        };


    }



    @Nullable
    @Override
    public String[] getHiddenLiveTemplateFiles() {
        return new String[0];
    }


}
