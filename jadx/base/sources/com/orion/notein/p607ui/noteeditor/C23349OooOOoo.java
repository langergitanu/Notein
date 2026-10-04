package com.orion.notein.p607ui.noteeditor;

import android.graphics.PointF;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.note.PdfInfo;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.p607ui.noteeditor.C23344OooOOo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0OoO0oo.C28694OooOO0O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.OooOo00;
import oO0o0O0o.C33596OooOOo0;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorViewModel$editorVO$1", m80623f = "NoteEditorViewModel.kt", m80624l = {523}, m80625m = "invokeSuspend")
public final class C23349OooOOoo extends AbstractC32476OooO implements OooOo00<NoteContent, Integer, Boolean, C23344OooOOo.OooO00o, String, Continuation<? super C28694OooOO0O>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f73641OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f73642OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public List f73643OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public ArrayList f73644OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public PdfInfo f73645OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f73646OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public float f73647OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public /* synthetic */ NoteContent f73648OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public /* synthetic */ int f73649OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final /* synthetic */ C23344OooOOo f73650Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public /* synthetic */ boolean f73651Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public /* synthetic */ Object f73652Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public /* synthetic */ Object f73653Oooo00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23349OooOOoo(C23344OooOOo c23344OooOOo, Continuation<? super C23349OooOOoo> continuation) {
        super(6, continuation);
        this.f73650Oooo0 = c23344OooOOo;
    }

    @Override // oO0O000o.OooOo00
    public final Object Oooo0OO(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Serializable serializable) {
        int iIntValue = ((Number) obj2).intValue();
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        C23349OooOOoo c23349OooOOoo = new C23349OooOOoo(this.f73650Oooo0, (Continuation) serializable);
        c23349OooOOoo.f73648OooOooO = (NoteContent) obj;
        c23349OooOOoo.f73649OooOooo = iIntValue;
        c23349OooOOoo.f73651Oooo000 = zBooleanValue;
        c23349OooOOoo.f73652Oooo00O = (C23344OooOOo.OooO00o) obj4;
        c23349OooOOoo.f73653Oooo00o = (String) obj5;
        return c23349OooOOoo.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        NoteContent noteContent;
        int i;
        boolean z;
        String str;
        PointF pointF;
        PointF pointF2;
        int i2;
        String id;
        Object objOooO0o0;
        float f;
        List<String> list;
        ArrayList arrayList;
        PdfInfo pdfInfo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = this.f73646OooOoo;
        boolean z2 = true;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            noteContent = this.f73648OooOooO;
            i = this.f73649OooOooo;
            z = this.f73651Oooo000;
            C23344OooOOo.OooO00o oooO00o = (C23344OooOOo.OooO00o) this.f73652Oooo00O;
            str = (String) this.f73653Oooo00o;
            if (noteContent.getZoom() > 16.0f || noteContent.getZoom() < 0.1d) {
                noteContent.setZoom(1.0f);
            }
            if (str != null) {
                noteContent.setZoom(1.0f);
            }
            Iterator<Page> it = noteContent.getPages().iterator();
            int savedPageIndex = 0;
            while (true) {
                if (!it.hasNext()) {
                    savedPageIndex = -1;
                    break;
                }
                if (OooOOO0.OooO0O0(it.next().getId(), oooO00o.f73619OooO00o)) {
                    break;
                }
                savedPageIndex++;
            }
            if (savedPageIndex == -1) {
                savedPageIndex = noteContent.getSavedPageIndex();
                pointF = new PointF(noteContent.getUnboundedPageOffsetX(), noteContent.getUnboundedPageOffsetY());
            } else {
                pointF = oooO00o.f73620OooO0O0;
            }
            pointF2 = pointF;
            String string = noteContent.getExtras().getString(NoteContent.EXTRA_APP_VERSION_CODE_STRING, "0");
            OooOOO0.OooO0o(string, "getString(...)");
            Integer numOooOOO0 = C33596OooOOo0.OooOOO0(string);
            long jIntValue = numOooOOO0 != null ? numOooOOO0.intValue() : 0;
            C23344OooOOo c23344OooOOo = this.f73650Oooo0;
            i2 = jIntValue > ((Number) c23344OooOOo.f73567OooOoOO.getValue()).longValue() ? 1 : 0;
            id = noteContent.getId();
            List<Page> pages = noteContent.getPages();
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(pages, 10));
            Iterator<T> it2 = pages.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((Page) it2.next()).getId());
            }
            List<String> pageLayerIds = noteContent.getPageLayerIds();
            PdfInfo pdfInfo2 = noteContent.getPdfInfo();
            float zoom = noteContent.getZoom();
            this.f73648OooOooO = noteContent;
            this.f73652Oooo00O = str;
            this.f73653Oooo00o = pointF2;
            this.f73641OooOo = id;
            this.f73644OooOoO0 = arrayList2;
            this.f73643OooOoO = pageLayerIds;
            this.f73645OooOoOO = pdfInfo2;
            this.f73649OooOooo = i;
            this.f73651Oooo000 = z;
            this.f73642OooOo0o = i2;
            this.f73647OooOoo0 = zoom;
            z2 = true;
            this.f73646OooOoo = 1;
            objOooO0o0 = C23344OooOOo.OooO0o0(c23344OooOOo, savedPageIndex, this);
            if (objOooO0o0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            f = zoom;
            list = pageLayerIds;
            arrayList = arrayList2;
            pdfInfo = pdfInfo2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            float f2 = this.f73647OooOoo0;
            int i4 = this.f73642OooOo0o;
            z = this.f73651Oooo000;
            i = this.f73649OooOooo;
            PdfInfo pdfInfo3 = this.f73645OooOoOO;
            List<String> list2 = this.f73643OooOoO;
            ArrayList arrayList3 = this.f73644OooOoO0;
            id = this.f73641OooOo;
            pointF2 = (PointF) this.f73653Oooo00o;
            str = (String) this.f73652Oooo00O;
            noteContent = this.f73648OooOooO;
            C32446OooOOOo.OooO0O0(obj);
            f = f2;
            pdfInfo = pdfInfo3;
            list = list2;
            arrayList = arrayList3;
            i2 = i4;
            objOooO0o0 = obj;
        }
        return new C28694OooOO0O(id, arrayList, list, pdfInfo, f, ((Number) objOooO0o0).intValue(), noteContent.getActivatedPageLayerId(), str, noteContent.getUnboundedNote(), pointF2, i, z, i2 != 0 ? z2 : false);
    }
}
