package oO0Oo;

import android.graphics.Bitmap;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.note.NoteMeta;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.C27545o00o0oo0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O00oo.C32519OooO0oO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33632Oooo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: oO0Oo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.AiOcrRecognizer$createTextPageWithNotePages$2", m80623f = "AiOcrRecognizer.kt", m80624l = {445, 447, 476, 489}, m80625m = "invokeSuspend")
public final class C33167OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public NoteMeta f119935OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public NoteContent f119936OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f119937OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C33632Oooo f119938OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f119939OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f119940OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f119941OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f119942OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f119943OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final /* synthetic */ String f119944Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public int f119945Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public /* synthetic */ Object f119946Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final /* synthetic */ C33173OooOO0o f119947Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final /* synthetic */ C32443OooOOO<Integer, Integer> f119948Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final /* synthetic */ String f119949Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ String f119950Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final /* synthetic */ String f119951Oooo0o0;

    /* JADX INFO: renamed from: oO0Oo.OooO0OO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.AiOcrRecognizer$createTextPageWithNotePages$2$1", m80623f = "AiOcrRecognizer.kt", m80624l = {460}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends Bitmap>>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C33173OooOO0o f119952OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f119953OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ int f119954OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ NoteContent f119955OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ int f119956OooOoOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C33173OooOO0o c33173OooOO0o, NoteContent noteContent, int i, int i2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f119952OooOo = c33173OooOO0o;
            this.f119955OooOoO0 = noteContent;
            this.f119954OooOoO = i;
            this.f119956OooOoOO = i2;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f119952OooOo, this.f119955OooOoO0, this.f119954OooOoO, this.f119956OooOoOO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends Bitmap>> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f119953OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            }
            C32446OooOOOo.OooO0O0(obj);
            C33173OooOO0o c33173OooOO0o = this.f119952OooOo;
            C27545o00o0oo0 c27545o00o0oo0 = c33173OooOO0o.f120040OooO00o;
            String id = this.f119955OooOoO0.getId();
            int iOooO0OO = C33173OooOO0o.OooO0OO(c33173OooOO0o);
            int i2 = this.f119954OooOoO;
            int iMin = Math.min(iOooO0OO + i2, this.f119956OooOoOO);
            this.f119953OooOo0o = 1;
            int i3 = C27545o00o0oo0.f96574OooOO0o;
            Serializable serializableOooO0oO = c27545o00o0oo0.OooO0oO(id, i2, iMin, 5, this);
            return serializableOooO0oO == enumC32485OooO00o ? enumC32485OooO00o : serializableOooO0oO;
        }
    }

    /* JADX INFO: renamed from: oO0Oo.OooO0OO$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.AiOcrRecognizer$createTextPageWithNotePages$2$2", m80623f = "AiOcrRecognizer.kt", m80624l = {484}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends Bitmap>>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C33173OooOO0o f119957OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f119958OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ int f119959OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ NoteContent f119960OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ int f119961OooOoOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(C33173OooOO0o c33173OooOO0o, NoteContent noteContent, int i, int i2, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f119957OooOo = c33173OooOO0o;
            this.f119960OooOoO0 = noteContent;
            this.f119959OooOoO = i;
            this.f119961OooOoOO = i2;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0O0(this.f119957OooOo, this.f119960OooOoO0, this.f119959OooOoO, this.f119961OooOoOO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends Bitmap>> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f119958OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            }
            C32446OooOOOo.OooO0O0(obj);
            C27545o00o0oo0 c27545o00o0oo0 = this.f119957OooOo.f120040OooO00o;
            String id = this.f119960OooOoO0.getId();
            this.f119958OooOo0o = 1;
            int i2 = C27545o00o0oo0.f96574OooOO0o;
            Serializable serializableOooO0oO = c27545o00o0oo0.OooO0oO(id, this.f119959OooOoO, this.f119961OooOoOO, 5, this);
            return serializableOooO0oO == enumC32485OooO00o ? enumC32485OooO00o : serializableOooO0oO;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33167OooO0OO(C33173OooOO0o c33173OooOO0o, String str, C32443OooOOO<Integer, Integer> c32443OooOOO, String str2, String str3, String str4, Continuation<? super C33167OooO0OO> continuation) {
        super(2, continuation);
        this.f119947Oooo00o = c33173OooOO0o;
        this.f119944Oooo0 = str;
        this.f119948Oooo0O0 = c32443OooOOO;
        this.f119949Oooo0OO = str2;
        this.f119951Oooo0o0 = str3;
        this.f119950Oooo0o = str4;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C33167OooO0OO c33167OooO0OO = new C33167OooO0OO(this.f119947Oooo00o, this.f119944Oooo0, this.f119948Oooo0O0, this.f119949Oooo0OO, this.f119951Oooo0o0, this.f119950Oooo0o, continuation);
        c33167OooO0OO.f119946Oooo00O = obj;
        return c33167OooO0OO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super String> continuation) {
        return ((C33167OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:34:0x00fb, B:33:0x00f9], limit reached: 69 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0112 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f2  */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x01df -> B:67:0x01e9). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC33636Oooo00o interfaceC33636Oooo00o;
        Object objOooOoO0;
        Object objOooOoOO;
        NoteContent noteContent;
        NoteMeta noteMeta;
        int iIntValue;
        int iIntValue2;
        int i;
        C33632Oooo c33632OoooOooO00o;
        int i2;
        int i3;
        int i4;
        InterfaceC33636Oooo00o interfaceC33636Oooo00o2;
        int i5;
        int i6;
        NoteMeta noteMeta2;
        int i7;
        int i8;
        NoteContent noteContent2;
        C33173OooOO0o c33173OooOO0o;
        ?? arrayList;
        int i9;
        int i10;
        NoteContent noteContent3;
        Object obj2;
        C33632Oooo c33632OoooOooO00o2;
        int i11;
        Object objAwait;
        int i12;
        C33167OooO0OO c33167OooO0OO = this;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i13 = c33167OooO0OO.f119945Oooo000;
        String str = c33167OooO0OO.f119944Oooo0;
        C32443OooOOO<Integer, Integer> c32443OooOOO = c33167OooO0OO.f119948Oooo0O0;
        boolean z = true;
        C33173OooOO0o c33173OooOO0o2 = c33167OooO0OO.f119947Oooo00o;
        if (i13 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) c33167OooO0OO.f119946Oooo00O;
            C27449o00O0OoO c27449o00O0OoO = c33173OooOO0o2.f120044OooO0o;
            c33167OooO0OO.f119946Oooo00O = interfaceC33636Oooo00o;
            c33167OooO0OO.f119945Oooo000 = 1;
            objOooOoO0 = c27449o00O0OoO.OooOoO0(str, c33167OooO0OO);
            if (objOooOoO0 != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i13 == 1) {
            interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) c33167OooO0OO.f119946Oooo00O;
            C32446OooOOOo.OooO0O0(obj);
            objOooOoO0 = obj;
        } else {
            if (i13 == 2) {
                NoteContent noteContent4 = c33167OooO0OO.f119936OooOo0o;
                InterfaceC33636Oooo00o interfaceC33636Oooo00o3 = (InterfaceC33636Oooo00o) c33167OooO0OO.f119946Oooo00O;
                C32446OooOOOo.OooO0O0(obj);
                noteContent = noteContent4;
                interfaceC33636Oooo00o = interfaceC33636Oooo00o3;
                objOooOoOO = obj;
                noteMeta = (NoteMeta) objOooOoOO;
                if (noteMeta != null || (iIntValue = c32443OooOOO.f116638OooOo0o.intValue()) >= (iIntValue2 = c32443OooOOO.f116637OooOo.intValue())) {
                    return "599999";
                }
                i = iIntValue2;
                c33632OoooOooO00o = C33609OooO0oo.OooO00o(interfaceC33636Oooo00o, null, new OooO00o(c33167OooO0OO.f119947Oooo00o, noteContent, iIntValue, iIntValue2, null), 3);
                C32519OooO0oO c32519OooO0oOOooO0oo = oO0O00oo.OooOO0.OooO0oo(oO0O00oo.OooOO0.OooO(iIntValue, i), C33173OooOO0o.OooO0OO(c33173OooOO0o2));
                i2 = c32519OooO0oOOooO0oo.f116812OooOo0o;
                i3 = c32519OooO0oOOooO0oo.f116811OooOo;
                i4 = c32519OooO0oOOooO0oo.f116813OooOoO0;
                if ((i4 > 0 && i2 <= i3) || (i4 < 0 && i3 <= i2)) {
                    interfaceC33636Oooo00o2 = interfaceC33636Oooo00o;
                    i5 = iIntValue;
                    i6 = i2;
                    noteMeta2 = noteMeta;
                    i7 = i4;
                    i8 = i3;
                    noteContent2 = noteContent;
                    c33173OooOO0o = c33173OooOO0o2;
                    if (!c33173OooOO0o2.f120039OooO.compareAndSet(z, false)) {
                    }
                }
                return "0";
            }
            if (i13 == 3) {
                i12 = c33167OooO0OO.f119943OooOooo;
                i7 = c33167OooO0OO.f119942OooOooO;
                i8 = c33167OooO0OO.f119940OooOoo;
                i6 = c33167OooO0OO.f119941OooOoo0;
                i = c33167OooO0OO.f119939OooOoOO;
                i11 = c33167OooO0OO.f119937OooOoO;
                noteMeta2 = c33167OooO0OO.f119935OooOo;
                noteContent2 = c33167OooO0OO.f119936OooOo0o;
                interfaceC33636Oooo00o2 = (InterfaceC33636Oooo00o) c33167OooO0OO.f119946Oooo00O;
                C32446OooOOOo.OooO0O0(obj);
                c33173OooOO0o = c33173OooOO0o2;
                objAwait = obj;
                arrayList = (List) objAwait;
                if (arrayList != 0) {
                }
            } else {
                if (i13 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i14 = c33167OooO0OO.f119942OooOooO;
                int i15 = c33167OooO0OO.f119940OooOoo;
                int i16 = c33167OooO0OO.f119941OooOoo0;
                i = c33167OooO0OO.f119939OooOoOO;
                int i17 = c33167OooO0OO.f119937OooOoO;
                C33632Oooo c33632Oooo = c33167OooO0OO.f119938OooOoO0;
                NoteMeta noteMeta3 = c33167OooO0OO.f119935OooOo;
                NoteContent noteContent5 = c33167OooO0OO.f119936OooOo0o;
                InterfaceC33636Oooo00o interfaceC33636Oooo00o4 = (InterfaceC33636Oooo00o) c33167OooO0OO.f119946Oooo00O;
                C32446OooOOOo.OooO0O0(obj);
                c33173OooOO0o = c33173OooOO0o2;
                int i18 = i17;
                c33632OoooOooO00o = c33632Oooo;
                noteMeta2 = noteMeta3;
                interfaceC33636Oooo00o2 = interfaceC33636Oooo00o4;
                int i19 = i15;
                i7 = i14;
                Object objOooO00o = obj;
                String str2 = (String) objOooO00o;
                if (!kotlin.jvm.internal.OooOOO0.OooO0O0(str2, "0")) {
                    if (i16 != i19) {
                        int i20 = i16 + i7;
                        z = true;
                        c33167OooO0OO = this;
                        i8 = i19;
                        c33173OooOO0o2 = c33173OooOO0o;
                        noteContent2 = noteContent5;
                        i6 = i20;
                        i5 = i18;
                        c33173OooOO0o = c33173OooOO0o2;
                        if (!c33173OooOO0o2.f120039OooO.compareAndSet(z, false)) {
                            return "599998";
                        }
                        int iMin = Math.min(C33173OooOO0o.OooO0OO(c33173OooOO0o) + i6, i) - i6;
                        if (c33632OoooOooO00o != null) {
                            c33167OooO0OO.f119946Oooo00O = interfaceC33636Oooo00o2;
                            c33167OooO0OO.f119936OooOo0o = noteContent2;
                            c33167OooO0OO.f119935OooOo = noteMeta2;
                            c33167OooO0OO.f119938OooOoO0 = null;
                            c33167OooO0OO.f119937OooOoO = i5;
                            c33167OooO0OO.f119939OooOoOO = i;
                            c33167OooO0OO.f119941OooOoo0 = i6;
                            c33167OooO0OO.f119940OooOoo = i8;
                            c33167OooO0OO.f119942OooOooO = i7;
                            c33167OooO0OO.f119943OooOooo = iMin;
                            c33167OooO0OO.f119945Oooo000 = 3;
                            objAwait = c33632OoooOooO00o.await(c33167OooO0OO);
                            if (objAwait != enumC32485OooO00o) {
                                i11 = i5;
                                i12 = iMin;
                                arrayList = (List) objAwait;
                                if (arrayList != 0) {
                                    iMin = i12;
                                    i5 = i11;
                                } else {
                                    i5 = i11;
                                    int i21 = i7;
                                    i9 = i6;
                                    NoteContent noteContent6 = noteContent2;
                                    InterfaceC33636Oooo00o interfaceC33636Oooo00o5 = interfaceC33636Oooo00o2;
                                    i19 = i8;
                                    i10 = i;
                                    NoteMeta noteMeta4 = noteMeta2;
                                    ?? r6 = arrayList;
                                    if (C33173OooOO0o.OooO0OO(c33173OooOO0o) + i9 >= i10) {
                                        int iOooO0OO = C33173OooOO0o.OooO0OO(c33173OooOO0o) + i9;
                                        OooO0O0 oooO0O0 = new OooO0O0(c33167OooO0OO.f119947Oooo00o, noteContent6, iOooO0OO, Math.min(C33173OooOO0o.OooO0OO(c33173OooOO0o) + iOooO0OO, i10), null);
                                        noteContent3 = noteContent6;
                                        obj2 = null;
                                        c33632OoooOooO00o2 = C33609OooO0oo.OooO00o(interfaceC33636Oooo00o5, null, oooO0O0, 3);
                                    } else {
                                        noteContent3 = noteContent6;
                                        obj2 = null;
                                        c33632OoooOooO00o2 = null;
                                    }
                                    String title = noteMeta4.getTitle();
                                    boolean z2 = i9 != i5;
                                    c33167OooO0OO.f119946Oooo00O = interfaceC33636Oooo00o5;
                                    c33167OooO0OO.f119936OooOo0o = noteContent3;
                                    c33167OooO0OO.f119935OooOo = noteMeta4;
                                    c33167OooO0OO.f119938OooOoO0 = c33632OoooOooO00o2;
                                    c33167OooO0OO.f119937OooOoO = i5;
                                    c33167OooO0OO.f119939OooOoOO = i10;
                                    c33167OooO0OO.f119941OooOoo0 = i9;
                                    c33167OooO0OO.f119940OooOoo = i19;
                                    c33167OooO0OO.f119942OooOooO = i21;
                                    c33167OooO0OO.f119945Oooo000 = 4;
                                    i18 = i5;
                                    noteContent5 = noteContent3;
                                    C33632Oooo c33632Oooo2 = c33632OoooOooO00o2;
                                    objOooO00o = C33173OooOO0o.OooO00o(c33167OooO0OO.f119947Oooo00o, c33167OooO0OO.f119949Oooo0OO, c33167OooO0OO.f119951Oooo0o0, noteContent5, title, c32443OooOOO, r6, c33167OooO0OO.f119950Oooo0o, z2, c33167OooO0OO);
                                    if (objOooO00o != enumC32485OooO00o) {
                                        i16 = i9;
                                        i = i10;
                                        i7 = i21;
                                        interfaceC33636Oooo00o2 = interfaceC33636Oooo00o5;
                                        c33632OoooOooO00o = c33632Oooo2;
                                        noteMeta2 = noteMeta4;
                                        String str22 = (String) objOooO00o;
                                        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(str22, "0")) {
                                            return str22;
                                        }
                                    }
                                }
                            }
                            return enumC32485OooO00o;
                        }
                        arrayList = new ArrayList(iMin);
                        for (int i22 = 0; i22 < iMin; i22++) {
                            arrayList.add(null);
                        }
                        int i212 = i7;
                        i9 = i6;
                        NoteContent noteContent62 = noteContent2;
                        InterfaceC33636Oooo00o interfaceC33636Oooo00o52 = interfaceC33636Oooo00o2;
                        i19 = i8;
                        i10 = i;
                        NoteMeta noteMeta42 = noteMeta2;
                        ?? r62 = arrayList;
                        if (C33173OooOO0o.OooO0OO(c33173OooOO0o) + i9 >= i10) {
                        }
                        String title2 = noteMeta42.getTitle();
                        if (i9 != i5) {
                        }
                        c33167OooO0OO.f119946Oooo00O = interfaceC33636Oooo00o52;
                        c33167OooO0OO.f119936OooOo0o = noteContent3;
                        c33167OooO0OO.f119935OooOo = noteMeta42;
                        c33167OooO0OO.f119938OooOoO0 = c33632OoooOooO00o2;
                        c33167OooO0OO.f119937OooOoO = i5;
                        c33167OooO0OO.f119939OooOoOO = i10;
                        c33167OooO0OO.f119941OooOoo0 = i9;
                        c33167OooO0OO.f119940OooOoo = i19;
                        c33167OooO0OO.f119942OooOooO = i212;
                        c33167OooO0OO.f119945Oooo000 = 4;
                        i18 = i5;
                        noteContent5 = noteContent3;
                        C33632Oooo c33632Oooo22 = c33632OoooOooO00o2;
                        objOooO00o = C33173OooOO0o.OooO00o(c33167OooO0OO.f119947Oooo00o, c33167OooO0OO.f119949Oooo0OO, c33167OooO0OO.f119951Oooo0o0, noteContent5, title2, c32443OooOOO, r62, c33167OooO0OO.f119950Oooo0o, z2, c33167OooO0OO);
                        if (objOooO00o != enumC32485OooO00o) {
                        }
                        return enumC32485OooO00o;
                    }
                    return "0";
                }
            }
        }
        NoteContent noteContent7 = (NoteContent) objOooOoO0;
        if (noteContent7 == null) {
            return "599999";
        }
        C27449o00O0OoO c27449o00O0OoO2 = c33173OooOO0o2.f120044OooO0o;
        c33167OooO0OO.f119946Oooo00O = interfaceC33636Oooo00o;
        c33167OooO0OO.f119936OooOo0o = noteContent7;
        c33167OooO0OO.f119945Oooo000 = 2;
        objOooOoOO = c27449o00O0OoO2.OooOoOO(str, c33167OooO0OO);
        if (objOooOoOO != enumC32485OooO00o) {
            noteContent = noteContent7;
            noteMeta = (NoteMeta) objOooOoOO;
            if (noteMeta != null) {
                return "599999";
            }
            i = iIntValue2;
            c33632OoooOooO00o = C33609OooO0oo.OooO00o(interfaceC33636Oooo00o, null, new OooO00o(c33167OooO0OO.f119947Oooo00o, noteContent, iIntValue, iIntValue2, null), 3);
            C32519OooO0oO c32519OooO0oOOooO0oo2 = oO0O00oo.OooOO0.OooO0oo(oO0O00oo.OooOO0.OooO(iIntValue, i), C33173OooOO0o.OooO0OO(c33173OooOO0o2));
            i2 = c32519OooO0oOOooO0oo2.f116812OooOo0o;
            i3 = c32519OooO0oOOooO0oo2.f116811OooOo;
            i4 = c32519OooO0oOOooO0oo2.f116813OooOoO0;
            if (i4 > 0) {
                interfaceC33636Oooo00o2 = interfaceC33636Oooo00o;
                i5 = iIntValue;
                i6 = i2;
                noteMeta2 = noteMeta;
                i7 = i4;
                i8 = i3;
                noteContent2 = noteContent;
                c33173OooOO0o = c33173OooOO0o2;
                if (!c33173OooOO0o2.f120039OooO.compareAndSet(z, false)) {
                }
            }
            interfaceC33636Oooo00o2 = interfaceC33636Oooo00o;
            i5 = iIntValue;
            i6 = i2;
            noteMeta2 = noteMeta;
            i7 = i4;
            i8 = i3;
            noteContent2 = noteContent;
            c33173OooOO0o = c33173OooOO0o2;
            if (!c33173OooOO0o2.f120039OooO.compareAndSet(z, false)) {
            }
        }
        return enumC32485OooO00o;
    }
}
