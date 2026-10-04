package o0Ooo000;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.dialog.NoteTreeInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0Ooo000.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29352OooOoO<T> implements InterfaceC33723OooO0oO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C29355OooOoo f104090OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33723OooO0oO f104091OooOo0o;

    /* JADX INFO: renamed from: o0Ooo000.OooOoO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.hyperlinkeditor.dialog.NoteTreeSelectionViewModel$special$$inlined$map$3$2", m80623f = "NoteTreeSelectionFragment.kt", m80624l = {50}, m80625m = "emit")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f104092OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f104093OooOo0o;

        public OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f104093OooOo0o = obj;
            this.f104092OooOo |= Integer.MIN_VALUE;
            return C29352OooOoO.this.emit(null, this);
        }
    }

    public C29352OooOoO(InterfaceC33723OooO0oO interfaceC33723OooO0oO, C29355OooOoo c29355OooOoo) {
        this.f104091OooOo0o = interfaceC33723OooO0oO;
        this.f104090OooOo = c29355OooOoo;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // oO0o0Oo.InterfaceC33723OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f104092OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f104092OooOo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object obj2 = oooO00o.f104093OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f104092OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            ArrayList arrayList = new ArrayList();
            for (T t : (List) obj) {
                if (((Folder) t).getParentId() == null) {
                    arrayList.add(t);
                }
            }
            ArrayList<Folder> arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (!((Folder) obj3).getInTrashBin()) {
                    arrayList2.add(obj3);
                }
            }
            ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(arrayList2, 10));
            for (Folder folder : arrayList2) {
                NoteTreeInfo noteTreeInfo = C29355OooOoo.f104107OooOO0;
                this.f104090OooOo.getClass();
                arrayList3.add(new NoteTreeInfo(folder.getId(), folder.getTitle(), EnumC29357OooOooO.f104117OooOoO, 0, false, folder.getCreationTime(), folder, folder.getParentId(), false, StyleIdentifier.GRID_TABLE_1_LIGHT_ACCENT_1, null));
            }
            oooO00o.f104092OooOo = 1;
            if (this.f104091OooOo0o.emit(arrayList3, oooO00o) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj2);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
