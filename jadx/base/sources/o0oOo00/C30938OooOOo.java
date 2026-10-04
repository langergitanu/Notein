package o0oOo00;

import android.net.Uri;
import androidx.lifecycle.AbstractC22019Ooooooo;
import androidx.lifecycle.o0OoOo0;
import com.orion.notein.domain.models.sticker.StickerCollection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import o00o00O0.C25252OooO0Oo;
import o0OO0O0.C26710OooOoo0;
import o0OOOO0o.C27129OoooOOO;
import o0OOo0Oo.InterfaceC27321Oooo0o;
import o0OOo0o.C27538o00o0o0O;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0Oo.C33763OoooOOO;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.C33784o00ooo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33788ooOO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o0oOo00.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lo0oOo00/OooOOo;", "Landroidx/lifecycle/Ooooooo;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class C30938OooOOo extends AbstractC22019Ooooooo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C33781o00o0O f110572OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C27538o00o0o0O f110573OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C27129OoooOOO f110574OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final InterfaceC27321Oooo0o f110575OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C33781o00o0O f110576OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C33781o00o0O f110577OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C33781o00o0O f110578OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final C33781o00o0O f110579OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final InterfaceC33721OooO0o<StickerCollection> f110580OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final C33769Ooooo0o f110581OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final C33781o00o0O f110582OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final C33769Ooooo0o f110583OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final C33769Ooooo0o f110584OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final C33769Ooooo0o f110585OooOOo0;

    public C30938OooOOo(C27129OoooOOO c27129OoooOOO, InterfaceC27321Oooo0o stickerRepo, C27538o00o0o0O stickerUseCase) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(stickerUseCase, "stickerUseCase");
        kotlin.jvm.internal.OooOOO0.OooO0oO(stickerRepo, "stickerRepo");
        this.f110573OooO0Oo = stickerUseCase;
        this.f110575OooO0o0 = stickerRepo;
        this.f110574OooO0o = c27129OoooOOO;
        Boolean bool = Boolean.FALSE;
        C33781o00o0O c33781o00o0OOooO00o = C33784o00ooo.OooO00o(bool);
        this.f110576OooO0oO = c33781o00o0OOooO00o;
        C33781o00o0O c33781o00o0OOooO00o2 = C33784o00ooo.OooO00o("");
        this.f110577OooO0oo = c33781o00o0OOooO00o2;
        C33781o00o0O c33781o00o0OOooO00o3 = C33784o00ooo.OooO00o("");
        this.f110572OooO = c33781o00o0OOooO00o3;
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        C33781o00o0O c33781o00o0OOooO00o4 = C33784o00ooo.OooO00o(c34434OooOoO);
        this.f110578OooOO0 = c33781o00o0OOooO00o4;
        C33781o00o0O c33781o00o0OOooO00o5 = C33784o00ooo.OooO00o(c34434OooOoO);
        this.f110579OooOO0O = c33781o00o0OOooO00o5;
        C26710OooOoo0 c26710OooOoo0 = new C26710OooOoo0(c33781o00o0OOooO00o2, this, 1);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
        InterfaceC33721OooO0o<StickerCollection> interfaceC33721OooO0oOooOo0O = C25252OooO0Oo.OooOo0O(c26710OooOoo0, executorC33873OooO0O0);
        this.f110580OooOO0o = interfaceC33721OooO0oOooOo0O;
        C33769Ooooo0o c33769Ooooo0oOooOoO0 = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooOoO(c33781o00o0OOooO00o2, new C30936OooOO0o(null, this)), C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34434OooOoO);
        C33781o00o0O c33781o00o0OOooO00o6 = C33784o00ooo.OooO00o(c34434OooOoO);
        this.f110582OooOOO0 = c33781o00o0OOooO00o6;
        C33769Ooooo0o c33769Ooooo0oOooOoO02 = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooOO0(interfaceC33721OooO0oOooOo0O, c33769Ooooo0oOooOoO0, c33781o00o0OOooO00o4, c33781o00o0OOooO00o5, c33781o00o0OOooO00o6, new C30937OooOOOo(null)), C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34434OooOoO);
        this.f110581OooOOO = c33769Ooooo0oOooOoO02;
        this.f110583OooOOOO = C25252OooO0Oo.OooOoO0(new C33763OoooOOO(c33769Ooooo0oOooOoO02, c33769Ooooo0oOooOoO0, new OooOOOO(null, this)), C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34434OooOoO);
        this.f110584OooOOOo = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooO0oo(c33781o00o0OOooO00o, c33769Ooooo0oOooOoO02, c33781o00o0OOooO00o3, new OooOO0O(4, null)), C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), Boolean.TRUE);
        this.f110585OooOOo0 = C25252OooO0Oo.OooOoO0(new OooOOO(interfaceC33721OooO0oOooOo0O), C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), bool);
    }

    public final void OooO0o0(List<? extends Uri> uris) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(uris, "uris");
        C33781o00o0O c33781o00o0O = this.f110578OooOO0;
        ArrayList arrayListOooooOO = OooOo.OooooOO(uris, (List) c33781o00o0O.getValue());
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, arrayListOooooOO);
    }
}
