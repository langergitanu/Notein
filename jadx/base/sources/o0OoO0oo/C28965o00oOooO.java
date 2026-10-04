package o0OoO0oo;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.orion.notein.p607ui.noteeditor.C23344OooOOo;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import o0Oo00o.C28028OooO0o;
import o0oo000O.C31186OooO0Oo;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoO0oo.o00oOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorViewModel$writeDisplayItemsToDragData$2", m80623f = "NoteEditorViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28965o00oOooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Object>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C23344OooOOo f102624OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ ArrayList f102625OooOo0o;

    /* JADX INFO: renamed from: o0OoO0oo.o00oOooO$OooO00o */
    @Metadata(m80611d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, m80612d2 = {"o0OoO0oo/o00oOooO$OooO00o", "Lcom/google/gson/reflect/TypeToken;", "", "Lo0oo0o/OooO0O0;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class OooO00o extends TypeToken<List<? extends InterfaceC31284OooO0O0>> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28965o00oOooO(C23344OooOOo c23344OooOOo, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f102625OooOo0o = arrayList;
        this.f102624OooOo = c23344OooOOo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28965o00oOooO(this.f102624OooOo, this.f102625OooOo0o, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Object> continuation) {
        return ((C28965o00oOooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        try {
            Type type = new OooO00o().getType();
            kotlin.jvm.internal.OooOOO0.OooO0o(type, "getType(...)");
            Object value = C28028OooO0o.f99373OooO0O0.getValue();
            kotlin.jvm.internal.OooOOO0.OooO0o(value, "getValue(...)");
            return Boolean.valueOf(C31186OooO0Oo.OooO0Oo(this.f102624OooOo.f73570OooOooO, ((Gson) value).toJson(this.f102625OooOo0o, type)));
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteEditorViewModel");
            c20358OooO00o.OooO0Oo(e, "writeDisplayItemsToDragData error.", new Object[0]);
            return C32460OooOooO.f116667OooO00o;
        }
    }
}
