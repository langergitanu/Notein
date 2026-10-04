package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZWB {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("taskpane", "row", "width", "locked", "visibility", "dockstate", "webextensionref");
    private zzZXU zzYN9;
    private Document zzZEY;

    private zzZWB(zzZXU zzzxu) {
        this.zzZEY = zzzxu.getDocument();
        this.zzYN9 = zzzxu;
    }

    private void zzIh() throws Exception {
        zzZXU zzzxu = this.zzYN9;
        zzZW1 zzzw1ZzY = zzzxu.zzY((com.aspose.words.internal.zz77) null, zzzxu.zzZmp().zzZkl());
        if (zzzw1ZzY == null) {
            return;
        }
        TaskPaneCollection webExtensionTaskPanes = this.zzZEY.getWebExtensionTaskPanes();
        while (zzzw1ZzY.zzQ("taskpanes")) {
            if (zzUR.zzTP(zzzw1ZzY.getLocalName()) != 0) {
                zzzw1ZzY.zzk();
            } else {
                webExtensionTaskPanes.add(zzU(zzzw1ZzY));
            }
        }
        this.zzYN9.zzZmi();
    }

    private TaskPane zzU(zzZW1 zzzw1) throws Exception {
        TaskPane taskPane = new TaskPane();
        while (zzzw1.zzi()) {
            int iZzTP = zzUR.zzTP(zzzw1.getLocalName());
            if (iZzTP == 1) {
                taskPane.setRow(zzzw1.zzb());
            } else if (iZzTP == 2) {
                taskPane.setWidth(zzzw1.zz9());
            } else if (iZzTP == 3) {
                taskPane.isLocked(zzzw1.zz8());
            } else if (iZzTP == 4) {
                taskPane.isVisible(zzzw1.zz8());
            } else if (iZzTP == 5) {
                taskPane.setDockState(zzZXP.zzMZ(zzzw1.getValue().toLowerCase()));
            }
        }
        while (zzzw1.zzQ("taskpane")) {
            if (zzUR.zzTP(zzzw1.getLocalName()) != 6) {
                zzzw1.zzk();
            } else {
                zzZ(zzzw1.zzV("id", ""), zzzw1.zzZmN(), taskPane.getWebExtension());
            }
        }
        return taskPane;
    }

    public static void zzZ(zzZXU zzzxu) throws Exception {
        new zzZWB(zzzxu).zzIh();
    }

    private void zzZ(String str, com.aspose.words.internal.zz77 zz77Var, WebExtension webExtension) throws Exception {
        if (zz77Var.zzxn().zzY7(str).isExternal()) {
            this.zzYN9.zzTG("Reference to web extension can not be external.");
        } else {
            zzZW6.zzZ(str, this.zzYN9, webExtension);
        }
    }
}
