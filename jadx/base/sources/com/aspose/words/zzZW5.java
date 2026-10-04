package com.aspose.words;

import com.aspose.words.ref.Ref;
import com.huawei.hms.network.embedded.C18437z2;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZW5 {
    private zzZXS zzYN8;

    private zzZW5(zzZXS zzzxs) {
        this.zzYN8 = zzzxs;
    }

    public static String zzZ(zzZXS zzzxs, com.aspose.words.internal.zz77 zz77Var, WebExtension webExtension) throws Exception {
        return new zzZW5(zzzxs).zzZ(zz77Var, webExtension);
    }

    private String zzZ(com.aspose.words.internal.zz77 zz77Var, WebExtension webExtension) throws Exception {
        zzZXS zzzxs = this.zzYN8;
        String str = com.aspose.words.internal.zzZKN.format("webextension{0}.xml", Integer.valueOf(zzzxs.zzNG(zzzxs.zzZmp().zzZkk())));
        Ref<String> ref = new Ref<>(null);
        zzZXS zzzxs2 = this.zzYN8;
        zzZYD zzzydZzY = zzzxs2.zzY(zz77Var, str, "application/vnd.ms-office.webextension+xml", zzzxs2.zzZmp().zzZkk(), ref);
        String str2 = ref.get();
        this.zzYN8.zzY(zzzydZzY);
        zzZ(zzzydZzY, webExtension);
        this.zzYN8.zzZlX();
        return str2;
    }

    private void zzZ(zzZYD zzzyd, WebExtension webExtension) throws Exception {
        zzzyd.zzZ("we:webextension");
        zzzyd.zzX("xmlns:we", "http://schemas.microsoft.com/office/webextensions/webextension/2010/11");
        zzzyd.zzX("id", webExtension.getId());
        zzzyd.zzw("frozen", webExtension.isFrozen());
        zzZ(zzzyd, webExtension.getReference());
        zzZ(zzzyd, webExtension.getAlternateReferences());
        zzZ(zzzyd, webExtension.getProperties());
        zzZ(zzzyd, webExtension.getBindings());
        zz7T.zzZ(webExtension.zzXSK() == null ? new zzH1() : webExtension.zzXSK(), this.zzYN8, "we:snapshot");
        zzzyd.endDocument();
    }

    private static void zzZ(zzZYD zzzyd, WebExtensionReference webExtensionReference) {
        zzzyd.zzY("we:reference");
        zzzyd.zzX("id", webExtensionReference.getId());
        zzzyd.zzX("version", webExtensionReference.getVersion());
        zzzyd.zzX("store", webExtensionReference.getStore());
        zzzyd.zzX("storeType", zzZXP.zzEM(webExtensionReference.getStoreType()));
        zzzyd.zzo();
    }

    private static void zzZ(zzZYD zzzyd, WebExtensionReferenceCollection webExtensionReferenceCollection) {
        if (zzZ(webExtensionReferenceCollection, zzzyd, "we:alternateReferences")) {
            return;
        }
        zzzyd.zzY("we:alternateReferences");
        Iterator<WebExtensionReference> it = webExtensionReferenceCollection.iterator();
        while (it.hasNext()) {
            zzZ(zzzyd, it.next());
        }
        zzzyd.zzo();
    }

    private static void zzZ(zzZYD zzzyd, WebExtensionPropertyCollection webExtensionPropertyCollection) {
        if (zzZ(webExtensionPropertyCollection, zzzyd, "we:properties")) {
            return;
        }
        zzzyd.zzY("we:properties");
        for (WebExtensionProperty webExtensionProperty : webExtensionPropertyCollection) {
            zzzyd.zzX("we:property", "name", webExtensionProperty.getName(), "value", webExtensionProperty.getValue());
        }
        zzzyd.zzo();
    }

    private static void zzZ(zzZYD zzzyd, WebExtensionBindingCollection webExtensionBindingCollection) {
        if (zzZ(webExtensionBindingCollection, zzzyd, "we:bindings")) {
            return;
        }
        zzzyd.zzY("we:bindings");
        for (WebExtensionBinding webExtensionBinding : webExtensionBindingCollection) {
            zzzyd.zzX("we:binding", "id", webExtensionBinding.getId(), C18437z2.f56754h, zzZXP.zzEL(webExtensionBinding.getBindingType()), "appref", webExtensionBinding.getAppRef());
        }
        zzzyd.zzo();
    }

    private static <T> boolean zzZ(BaseWebExtensionCollection<T> baseWebExtensionCollection, zzZYD zzzyd, String str) {
        boolean z = baseWebExtensionCollection.getCount() == 0;
        if (z) {
            zzzyd.zzZ(str, (String) null);
        }
        return z;
    }
}
