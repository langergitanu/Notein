package androidx.ink.storage;

import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.google.firebase.inappmessaging.internal.ProxyAnalyticsConnector;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.orion.notein.p607ui.paperconfig.MyTemplateFragment;
import com.orion.notein.p607ui.paperconfig.MyTemplateFragment.C23760OooO0Oo;
import kotlin.jvm.internal.OooOOO0;
import o000OO00.o000oOoO;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 implements TexturePngBytesLookup, Deferred.DeferredHandler, OooO0o.OooO00o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f65446OooOo0o;

    public /* synthetic */ OooO0O0(Object obj) {
        this.f65446OooOo0o = obj;
    }

    @Override // OooO0o.OooO00o
    public void OooO0O0(Object obj) {
        Uri data;
        ActivityResult result = (ActivityResult) obj;
        OooOOO0.OooO0oO(result, "result");
        Intent intent = result.f62239OooOo;
        if (intent == null || (data = intent.getData()) == null) {
            return;
        }
        MyTemplateFragment myTemplateFragment = (MyTemplateFragment) this.f65446OooOo0o;
        InterfaceC21987OooOoo viewLifecycleOwner = myTemplateFragment.getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, myTemplateFragment.new C23760OooO0Oo(data, null), 3);
    }

    @Override // androidx.ink.storage.TexturePngBytesLookup
    public byte[] getTexturePngBytes(String str) {
        return AndroidBrushFamilyExtensions.toTexturePngBytesLookup$lambda$0((o000oOoO) this.f65446OooOo0o, str);
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void handle(Provider provider) {
        ((ProxyAnalyticsConnector) this.f65446OooOo0o).lambda$new$0(provider);
    }
}
