package o0Ooo000;

import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.dialog.NoteTreeInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0O0o.C33599OooOo0O;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0Ooo000.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.hyperlinkeditor.dialog.NoteTreeSelectionViewModel$searchedResult$1", m80623f = "NoteTreeSelectionFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29350OooOo0O extends AbstractC32476OooO implements InterfaceC32510OooOOo0<List<? extends NoteTreeInfo>, String, Continuation<? super List<? extends NoteTreeInfo>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ String f104084OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f104085OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(List<? extends NoteTreeInfo> list, String str, Continuation<? super List<? extends NoteTreeInfo>> continuation) {
        C29350OooOo0O c29350OooOo0O = new C29350OooOo0O(3, continuation);
        c29350OooOo0O.f104085OooOo0o = list;
        c29350OooOo0O.f104084OooOo = str;
        return c29350OooOo0O.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list = this.f104085OooOo0o;
        String str = this.f104084OooOo;
        if (str.length() <= 0) {
            return C34434OooOoO.f123453OooOo0o;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            String lowerCase = ((NoteTreeInfo) obj2).getTitle().toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.OooOOO0.OooO0o(lowerCase, "toLowerCase(...)");
            if (C33599OooOo0O.OooOoOO(lowerCase, str, false)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
