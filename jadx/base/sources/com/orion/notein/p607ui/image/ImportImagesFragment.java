package com.orion.notein.p607ui.image;

import OooO0o.OooO0O0;
import OooO0o.OooOO0;
import OooO0o.OooOO0O;
import OooO0oO.C20433OooO0OO;
import OooO0oO.C20436OooO0o0;
import OooO0oO.C20439OooO0oo;
import OooO0oO.C20440OooOO0;
import OooooOo.C21387OooOOo;
import OooooOo.C21389OooOOoo;
import android.content.Intent;
import android.net.Uri;
import com.google.firebase.inappmessaging.internal.C22739OooOoO0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0OoO0oo.C28918o00o0O;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/image/ImportImagesFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ImportImagesFragment extends Hilt_ImportImagesFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public Uri f71857OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public InterfaceC32507OooOO0o<? super List<? extends Uri>, C32460OooOooO> f71858OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final OooO0O0<OooOO0> f71859OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public C28918o00o0O f71860OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final OooO0O0<Uri> f71861Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final OooO0O0<Intent> f71862Oooo00O;

    public ImportImagesFragment() {
        OooO0O0<OooOO0> oooO0O0RegisterForActivityResult = registerForActivityResult(new C20433OooO0OO(9), new C22739OooOoO0(this, 1));
        OooOOO0.OooO0o(oooO0O0RegisterForActivityResult, "registerForActivityResult(...)");
        this.f71859OooOooO = oooO0O0RegisterForActivityResult;
        OooO0O0<Uri> oooO0O0RegisterForActivityResult2 = registerForActivityResult(new C20440OooOO0(), new C21387OooOOo(this));
        OooOOO0.OooO0o(oooO0O0RegisterForActivityResult2, "registerForActivityResult(...)");
        this.f71861Oooo000 = oooO0O0RegisterForActivityResult2;
        OooO0O0<Intent> oooO0O0RegisterForActivityResult3 = registerForActivityResult(new C20439OooO0oo(), new C21389OooOOoo(this));
        OooOOO0.OooO0o(oooO0O0RegisterForActivityResult3, "registerForActivityResult(...)");
        this.f71862Oooo00O = oooO0O0RegisterForActivityResult3;
    }

    public final void OooOoO(InterfaceC32507OooOO0o<? super List<? extends Uri>, C32460OooOooO> interfaceC32507OooOO0o) {
        this.f71858OooOoo0 = interfaceC32507OooOO0o;
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("image/*");
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        this.f71862Oooo00O.OooO00o(intent);
    }

    public final void OooOoOO(InterfaceC32507OooOO0o<? super List<? extends Uri>, C32460OooOooO> interfaceC32507OooOO0o) {
        this.f71858OooOoo0 = interfaceC32507OooOO0o;
        this.f71859OooOooO.OooO00o(OooOO0O.OooO00o(new C20436OooO0o0.C18959OooO0o0()));
    }
}
