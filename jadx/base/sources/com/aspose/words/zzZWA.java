package com.aspose.words;

import com.aspose.words.ref.Ref;

/* JADX INFO: loaded from: classes6.dex */
final class zzZWA {
    public static void zzZ(zzZXS zzzxs) throws Exception {
        TaskPaneCollection webExtensionTaskPanes = zzzxs.getDocument().getWebExtensionTaskPanes();
        if (webExtensionTaskPanes.getCount() == 0) {
            return;
        }
        zzZ(zzzxs, webExtensionTaskPanes);
    }

    private static void zzZ(zzZXS zzzxs, TaskPaneCollection taskPaneCollection) throws Exception {
        Ref<String> ref = new Ref<>(null);
        zzZYD zzzydZzY = zzzxs.zzY(null, "/word/webextensions/taskpanes.xml", "application/vnd.ms-office.webextensiontaskpanes+xml", zzzxs.zzZmp().zzZkl(), ref);
        ref.get();
        zzzxs.zzY(zzzydZzY);
        zzzydZzY.zzZ("wetp:taskpanes");
        zzzydZzY.zzX("xmlns:wetp", "http://schemas.microsoft.com/office/webextensions/taskpanes/2010/11");
        for (TaskPane taskPane : taskPaneCollection) {
            zzZ(zzzydZzY, taskPane, zzZW5.zzZ(zzzxs, zzzydZzY.zzZmN(), taskPane.getWebExtension()));
        }
        zzzydZzY.endDocument();
        zzzxs.zzZlX();
    }

    private static void zzZ(zzZYD zzzyd, TaskPane taskPane, String str) {
        zzzyd.zzY("wetp:taskpane");
        zzzyd.zz0("dockstate", zzZXP.zzEN(taskPane.getDockState()));
        zzzyd.zzw("locked", taskPane.isLocked());
        zzzyd.zzx("visibility", taskPane.isVisible());
        zzzyd.zzO("width", taskPane.getWidth());
        zzzyd.zzZj("row", taskPane.getRow());
        zzzyd.zzX("wetp:webextensionref", "xmlns:r", zzZX5.zz9(0, zzzyd.zzZtY() == 2), "r:id", str);
        zzzyd.zzo();
    }
}
