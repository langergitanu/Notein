package com.aspose.words;

import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: loaded from: classes6.dex */
final class zzZW6 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("id", "frozen", "reference", "alternateReferences", "properties", "bindings", "snapshot", "store", "version", "storeType", "property", "name", "value", "binding", "appref", C18437z2.f56754h);

    private static WebExtensionBinding zzS(zzZW1 zzzw1) {
        WebExtensionBinding webExtensionBinding = new WebExtensionBinding();
        while (zzzw1.zzi()) {
            int iZzTP = zzUR.zzTP(zzzw1.getLocalName());
            if (iZzTP == 0) {
                webExtensionBinding.setId(zzzw1.getValue());
            } else if (iZzTP == 14) {
                webExtensionBinding.setAppRef(zzzw1.getValue());
            } else if (iZzTP == 15) {
                webExtensionBinding.setBindingType(zzZXP.zzMX(zzzw1.getValue().toLowerCase()));
            }
        }
        return webExtensionBinding;
    }

    private static WebExtensionProperty zzT(zzZW1 zzzw1) {
        WebExtensionProperty webExtensionProperty = new WebExtensionProperty();
        while (zzzw1.zzi()) {
            int iZzTP = zzUR.zzTP(zzzw1.getLocalName());
            if (iZzTP == 11) {
                webExtensionProperty.setName(zzzw1.getValue());
            } else if (iZzTP == 12) {
                webExtensionProperty.setValue(zzzw1.getValue());
            }
        }
        return webExtensionProperty;
    }

    public static void zzZ(String str, zzZXU zzzxu, WebExtension webExtension) throws Exception {
        zzZW1 zzzw1ZzNK = zzzxu.zzNK(str);
        while (zzzw1ZzNK.zzi()) {
            int iZzTP = zzUR.zzTP(zzzw1ZzNK.getLocalName());
            if (iZzTP == 0) {
                webExtension.setId(zzzw1ZzNK.getValue());
            } else if (iZzTP == 1) {
                webExtension.isFrozen(zzzw1ZzNK.zz8());
            }
        }
        while (zzzw1ZzNK.zzQ("webextension")) {
            int iZzTP2 = zzUR.zzTP(zzzw1ZzNK.getLocalName());
            if (iZzTP2 == 2) {
                zzZ(zzzw1ZzNK, webExtension.getReference());
            } else if (iZzTP2 == 3) {
                zzZ(zzzw1ZzNK, webExtension.getAlternateReferences());
            } else if (iZzTP2 == 4) {
                zzZ(zzzw1ZzNK, webExtension.getProperties());
            } else if (iZzTP2 == 5) {
                zzZ(zzzw1ZzNK, webExtension.getBindings());
            } else if (iZzTP2 != 6) {
                zzzw1ZzNK.zzk();
            } else {
                webExtension.zzV(zz7V.zz9(zzzxu));
            }
        }
        zzzxu.zzZmi();
    }

    private static void zzZ(zzZW1 zzzw1, WebExtensionReference webExtensionReference) {
        while (zzzw1.zzi()) {
            int iZzTP = zzUR.zzTP(zzzw1.getLocalName());
            if (iZzTP == 0) {
                webExtensionReference.setId(zzzw1.getValue());
            } else if (iZzTP == 7) {
                webExtensionReference.setStore(zzzw1.getValue());
            } else if (iZzTP == 8) {
                webExtensionReference.setVersion(zzzw1.getValue());
            } else if (iZzTP == 9) {
                webExtensionReference.setStoreType(zzZXP.zzMY(zzzw1.getValue().toLowerCase()));
            }
        }
    }

    private static void zzZ(zzZW1 zzzw1, WebExtensionReferenceCollection webExtensionReferenceCollection) {
        while (zzzw1.zzQ("alternateReferences")) {
            if (zzUR.zzTP(zzzw1.getLocalName()) != 2) {
                zzzw1.zzk();
            } else {
                WebExtensionReference webExtensionReference = new WebExtensionReference();
                webExtensionReferenceCollection.add(webExtensionReference);
                zzZ(zzzw1, webExtensionReference);
            }
        }
    }

    private static void zzZ(zzZW1 zzzw1, WebExtensionPropertyCollection webExtensionPropertyCollection) {
        while (zzzw1.zzQ("properties")) {
            if (zzUR.zzTP(zzzw1.getLocalName()) != 10) {
                zzzw1.zzk();
            } else {
                webExtensionPropertyCollection.add(zzT(zzzw1));
            }
        }
    }

    private static void zzZ(zzZW1 zzzw1, WebExtensionBindingCollection webExtensionBindingCollection) {
        while (zzzw1.zzQ("bindings")) {
            if (zzUR.zzTP(zzzw1.getLocalName()) != 13) {
                zzzw1.zzk();
            } else {
                webExtensionBindingCollection.add(zzS(zzzw1));
            }
        }
    }
}
