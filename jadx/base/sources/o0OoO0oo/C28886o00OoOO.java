package o0OoO0oo;

import com.orion.editor.PDFView;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import com.orion.penkit.models.DrawRecord;
import com.orion.penkit.models.InkStrokeInfo;
import com.orion.penkit.models.ShapeInfo;
import com.orion.penkit.models.TextBoxInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import o000oooo.C24761OooO;
import o0O0o00.EnumC25982o0000oO;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOO.AbstractC33687OooO0oO;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0o0o.C33874OooO0OO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoO0oo.o00OoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$updateSelectedRecordsColor$1", m80623f = "NoteEditorFragment.kt", m80624l = {5500}, m80625m = "invokeSuspend")
public final class C28886o00OoOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ int f102344OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f102345OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ NoteEditorFragment f102346OooOoO0;

    /* JADX INFO: renamed from: o0OoO0oo.o00OoOO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$updateSelectedRecordsColor$1$1", m80623f = "NoteEditorFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ NoteEditorFragment f102347OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ List<InterfaceC31284OooO0O0> f102348OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ int f102349OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(List<? extends InterfaceC31284OooO0O0> list, NoteEditorFragment noteEditorFragment, int i, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f102348OooOo0o = list;
            this.f102347OooOo = noteEditorFragment;
            this.f102349OooOoO0 = i;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f102348OooOo0o, this.f102347OooOo, this.f102349OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            InterfaceC31284OooO0O0 interfaceC31284OooO0O0Copy$default;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<InterfaceC31284OooO0O0> list = this.f102348OooOo0o;
            ArrayList arrayList = new ArrayList();
            for (InterfaceC31284OooO0O0 interfaceC31284OooO0O0 : list) {
                boolean z = interfaceC31284OooO0O0 instanceof DrawRecord;
                int i = this.f102349OooOoO0;
                if (z) {
                    interfaceC31284OooO0O0Copy$default = DrawRecord.copy$default((DrawRecord) interfaceC31284OooO0O0, C24761OooO.OooO00o("toString(...)"), 0, i, 0.0f, null, null, null, 0L, false, null, false, 2042, null);
                } else if (interfaceC31284OooO0O0 instanceof InkStrokeInfo) {
                    String string = UUID.randomUUID().toString();
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
                    interfaceC31284OooO0O0Copy$default = ((InkStrokeInfo) interfaceC31284OooO0O0).copyWithColorIntArgb(string, i);
                } else if (interfaceC31284OooO0O0 instanceof ShapeInfo) {
                    interfaceC31284OooO0O0Copy$default = ShapeInfo.copy$default((ShapeInfo) interfaceC31284OooO0O0, C24761OooO.OooO00o("toString(...)"), i, 0.0f, null, 0, 0, null, 0L, 0, false, 0, false, 4092, null);
                } else {
                    boolean z2 = interfaceC31284OooO0O0 instanceof TextBoxInfo;
                    interfaceC31284OooO0O0Copy$default = interfaceC31284OooO0O0;
                }
                linkedHashMap.put(interfaceC31284OooO0O0.getId(), interfaceC31284OooO0O0Copy$default.getId());
                arrayList.add(interfaceC31284OooO0O0Copy$default);
            }
            NoteEditorFragment noteEditorFragment = this.f102347OooOo;
            noteEditorFragment.Oooooo(linkedHashMap);
            PDFView pDFView = noteEditorFragment.f73015OoooO0;
            if (pDFView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            pDFView.o00oO0O(list, arrayList, EnumC25982o0000oO.f88735OooOo0o);
            noteEditorFragment.oo000o(arrayList);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28886o00OoOO(int i, NoteEditorFragment noteEditorFragment, Continuation<? super C28886o00OoOO> continuation) {
        super(2, continuation);
        this.f102344OooOo = i;
        this.f102346OooOoO0 = noteEditorFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28886o00OoOO(this.f102344OooOo, this.f102346OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28886o00OoOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102345OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            StringBuilder sb = new StringBuilder("updateSelectedRecordsColor: ");
            int i2 = this.f102344OooOo;
            sb.append(i2);
            c20358OooO00o.OooO00o(sb.toString(), new Object[0]);
            NoteEditorFragment noteEditorFragment = this.f102346OooOoO0;
            List list = (List) noteEditorFragment.OoooOO0().f73604o00Oo0.getValue();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            AbstractC33687OooO0oO abstractC33687OooO0oO = C33833OooOOOO.f121946OooO00o;
            OooO00o oooO00o = new OooO00o(list, noteEditorFragment, i2, null);
            this.f102345OooOo0o = 1;
            if (C33609OooO0oo.OooO0o(abstractC33687OooO0oO, oooO00o, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
