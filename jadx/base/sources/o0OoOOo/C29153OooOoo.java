package o0OoOOo;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OoOOo.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$insertAudioFiles$1", m80623f = "NoteAudioViewModel.kt", m80624l = {1615}, m80625m = "invokeSuspend")
public final class C29153OooOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public com.orion.notein.p607ui.noteeditor.audio.OooO0o f103327OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f103328OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f103329OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Iterator f103330OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.audio.OooO0o f103331OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ ArrayList f103332OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29153OooOoo(com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f103331OooOoOO = oooO0o;
        this.f103332OooOoo0 = arrayList;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29153OooOoo(this.f103331OooOoOO, this.f103332OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29153OooOoo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        String str;
        Iterator it;
        com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f103329OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o2 = this.f103331OooOoOO;
            String str2 = (String) oooO0o2.f74230OooOOO.getValue();
            if (str2 == null) {
                return C32460OooOooO.f116667OooO00o;
            }
            str = str2;
            it = this.f103332OooOoo0.iterator();
            oooO0o = oooO0o2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f103330OooOoO0;
            oooO0o = this.f103327OooOo;
            str = this.f103328OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            this.f103328OooOo0o = str;
            this.f103327OooOo = oooO0o;
            this.f103330OooOoO0 = it;
            this.f103329OooOoO = 1;
            if (com.orion.notein.p607ui.noteeditor.audio.OooO0o.OooO0oo(oooO0o, uri, str, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
