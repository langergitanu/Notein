package o0Ooo000;

import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.dialog.NoteTreeInfo;
import java.util.Comparator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o000OoO.C24536OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: o0Ooo000.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.hyperlinkeditor.dialog.NoteTreeSelectionViewModel$initialTreeItems$1", m80623f = "NoteTreeSelectionFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29348OooOo0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<List<? extends NoteTreeInfo>, List<? extends NoteTreeInfo>, Continuation<? super List<? extends NoteTreeInfo>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ List f104074OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f104075OooOo0o;

    /* JADX INFO: renamed from: o0Ooo000.OooOo0$OooO00o */
    public static final class OooO00o<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C24536OooO0Oo.OooO0O0(Long.valueOf(((NoteTreeInfo) t2).getCreateTime()), Long.valueOf(((NoteTreeInfo) t).getCreateTime()));
        }
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(List<? extends NoteTreeInfo> list, List<? extends NoteTreeInfo> list2, Continuation<? super List<? extends NoteTreeInfo>> continuation) {
        C29348OooOo0 c29348OooOo0 = new C29348OooOo0(3, continuation);
        c29348OooOo0.f104075OooOo0o = list;
        c29348OooOo0.f104074OooOo = list2;
        return c29348OooOo0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        return oOo000Oo.OooOo.o00O0O(oOo000Oo.OooOo.OooooOO(this.f104075OooOo0o, this.f104074OooOo), new OooO00o());
    }
}
