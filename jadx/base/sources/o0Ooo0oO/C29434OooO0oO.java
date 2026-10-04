package o0Ooo0oO;

import android.graphics.Rect;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.page.PaperOrientation;
import com.orion.notein.domain.models.page.PaperSpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.C27585o00ooO0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o0Ooo0oO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagepadding.viewmodel.PagePaddingViewModel$savePage$1", m80623f = "PagePaddingViewModel.kt", m80624l = {748, 766, 847, 874}, m80625m = "invokeSuspend")
public final class C29434OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f104462OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f104463OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f104464OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public ArrayList f104465OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f104466OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ C29423OooO00o f104467OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f104468OooOoo0;

    /* JADX INFO: renamed from: o0Ooo0oO.OooO0oO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagepadding.viewmodel.PagePaddingViewModel$savePage$1$2", m80623f = "PagePaddingViewModel.kt", m80624l = {854, 861, 869}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f104469OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public Page f104470OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ C29423OooO00o f104471OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ List<Page> f104472OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ NoteContent f104473OooOoOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(List<Page> list, C29423OooO00o c29423OooO00o, NoteContent noteContent, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f104472OooOoO0 = list;
            this.f104471OooOoO = c29423OooO00o;
            this.f104473OooOoOO = noteContent;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f104472OooOoO0, this.f104471OooOoO, this.f104473OooOoOO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x00f0, code lost:
        
            if (r2 == r1) goto L34;
         */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00d6  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00d9  */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOooO00o;
            Page page;
            Object objOooOoOO;
            NoteMeta noteMetaCopy$default;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f104469OooOo;
            NoteContent noteContent = this.f104473OooOoOO;
            C29423OooO00o c29423OooO00o = this.f104471OooOoO;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                List<Page> list = this.f104472OooOoO0;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Page) it.next()).getId());
                }
                Set setO0OO00O = OooOo.o0OO00O(arrayList);
                C27585o00ooO0 c27585o00ooO0 = c29423OooO00o.f104363OooO0o0;
                String id = noteContent.getId();
                this.f104469OooOo = 1;
                objOooO00o = c27585o00ooO0.OooO00o(setO0OO00O, id, true, this);
                if (objOooO00o != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                }
                page = this.f104470OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooOoOO = obj;
                NoteMeta noteMeta = (NoteMeta) objOooOoOO;
                C32443OooOOO<Integer, Integer> tnSize = page.getTnSize();
                noteMetaCopy$default = noteMeta == null ? NoteMeta.copy$default(noteMeta, null, null, null, null, null, false, null, tnSize.f116638OooOo0o.intValue(), tnSize.f116637OooOo.intValue(), false, null, 0, 0L, 0L, null, false, false, false, 0L, 523903, null) : null;
                if (noteMetaCopy$default != null) {
                    C27449o00O0OoO c27449o00O0OoO = c29423OooO00o.f104361OooO0Oo;
                    this.f104470OooOo0o = null;
                    this.f104469OooOo = 3;
                    Object objOooOo0O = c27449o00O0OoO.f96036OooO0O0.OooOo0O(new NoteMeta[]{noteMetaCopy$default}, this);
                    if (objOooOo0O != EnumC32485OooO00o.f116726OooOo0o) {
                        objOooOo0O = C32460OooOooO.f116667OooO00o;
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            objOooO00o = obj;
            page = (Page) ((Map) objOooO00o).get(((Page) OooOo.Oooo0oO(noteContent.getPages())).getId());
            if (page != null) {
                C27449o00O0OoO c27449o00O0OoO2 = c29423OooO00o.f104361OooO0Oo;
                String id2 = noteContent.getId();
                this.f104470OooOo0o = page;
                this.f104469OooOo = 2;
                objOooOoOO = c27449o00O0OoO2.OooOoOO(id2, this);
                if (objOooOoOO != enumC32485OooO00o) {
                    NoteMeta noteMeta2 = (NoteMeta) objOooOoOO;
                    C32443OooOOO<Integer, Integer> tnSize2 = page.getTnSize();
                    if (noteMeta2 == null) {
                    }
                    if (noteMetaCopy$default != null) {
                    }
                }
                return enumC32485OooO00o;
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29434OooO0oO(C29423OooO00o c29423OooO00o, Continuation<? super C29434OooO0oO> continuation) {
        super(2, continuation);
        this.f104467OooOoo = c29423OooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29434OooO0oO(this.f104467OooOoo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29434OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x02ad, code lost:
    
        if (r1.emit(r2, r43) != r3) goto L96;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0288 A[PHI: r1 r2
      0x0288: PHI (r1v19 java.util.List) = (r1v28 java.util.List), (r1v29 java.util.List) binds: [B:91:0x0285, B:11:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x0288: PHI (r2v5 com.orion.notein.domain.models.note.NoteContent) = (r2v4 com.orion.notein.domain.models.note.NoteContent), (r2v8 com.orion.notein.domain.models.note.NoteContent) binds: [B:91:0x0285, B:11:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Page page;
        Object objOooOoO0;
        Page page2;
        NoteContent noteContent;
        ArrayList arrayList;
        Object objOooo00o;
        ArrayList arrayList2;
        int i;
        int i2;
        ArrayList arrayList3;
        NoteContent noteContent2;
        Object objOoooO0O;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        List list;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i8 = this.f104468OooOoo0;
        C29423OooO00o c29423OooO00o = this.f104467OooOoo;
        if (i8 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            page = (Page) c29423OooO00o.f104374OooOOo0.f121747OooOo0o.getValue();
            if (page == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("PagePaddingViewModel");
                c20358OooO00o.OooO0OO("Composed page is null", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            String str = (String) c29423OooO00o.f104360OooO.getValue();
            this.f104463OooOo0o = page;
            this.f104468OooOoo0 = 1;
            objOooOoO0 = c29423OooO00o.f104361OooO0Oo.OooOoO0(str, this);
            if (objOooOoO0 != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i8 == 1) {
            page = (Page) this.f104463OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            objOooOoO0 = obj;
        } else {
            if (i8 == 2) {
                i2 = this.f104466OooOoOO;
                int i9 = this.f104464OooOoO;
                ArrayList arrayList4 = this.f104465OooOoO0;
                noteContent = (NoteContent) this.f104462OooOo;
                page2 = (Page) this.f104463OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                i = i9;
                objOooo00o = obj;
                arrayList2 = arrayList4;
                int i10 = 0;
                for (Object obj2 : (List) objOooo00o) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        C34429OooOOo0.OooOOo();
                        throw null;
                    }
                    Page page3 = (Page) obj2;
                    if (i10 == 0 && i2 == 0) {
                        i6 = i;
                    } else if (i10 == i) {
                        arrayList2.add(page2);
                        i6 = i;
                    } else {
                        AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = C29423OooO00o.f104358OooOoo0;
                        c29423OooO00o.getClass();
                        C32443OooOOO c32443OooOOOOooOOO0 = C29423OooO00o.OooOOO0(page3);
                        int iIntValue = ((Number) c32443OooOOOOooOOO0.f116638OooOo0o).intValue();
                        int iIntValue2 = ((Number) c32443OooOOOOooOOO0.f116637OooOo).intValue();
                        Rect rectOooO0oo = page3.getRotationDirection() != page2.getRotationDirection() ? C29423OooO00o.OooO0oo(page2.getRotatedPaperPadding(), page3.getRotationDirection()) : page2.getUnrotatedPaperPadding();
                        if (iIntValue >= 5000) {
                            i4 = 0;
                            i3 = 0;
                        } else {
                            i3 = rectOooO0oo.left;
                            int i12 = iIntValue + i3;
                            if (i12 >= 5000) {
                                i3 = 5000 - iIntValue;
                                i4 = 0;
                            } else {
                                i4 = rectOooO0oo.right;
                                if (i12 + i4 >= 5000) {
                                    i4 = (5000 - iIntValue) - i3;
                                }
                                if (iIntValue2 < 5000) {
                                    i6 = i;
                                    i5 = 0;
                                } else {
                                    i5 = rectOooO0oo.top;
                                    i6 = i;
                                    int i13 = iIntValue2 + i5;
                                    if (i13 >= 5000) {
                                        i5 = 5000 - iIntValue2;
                                    } else {
                                        i7 = rectOooO0oo.bottom;
                                        if (i13 + i7 >= 5000) {
                                            i7 = (5000 - iIntValue2) - i5;
                                        }
                                        Rect rect = new Rect(i3, i5, i4, i7);
                                        arrayList2.add(Page.copy$default(page3, null, null, page3.getPaperOrientation() == PaperOrientation.VERTICAL ? new PaperSpec("Custom", null, false, iIntValue + rect.left + rect.right, iIntValue2 + rect.top + rect.bottom, null, null, 0, 0, 486, null) : new PaperSpec("Custom", null, false, iIntValue2 + rect.top + rect.bottom, iIntValue + rect.left + rect.right, null, null, 0, 0, 486, null), null, null, page2.getPaddingStyle(), rect, null, false, 0, 0L, 0L, null, null, 0, false, null, null, null, 524187, null));
                                    }
                                }
                                i7 = 0;
                                Rect rect2 = new Rect(i3, i5, i4, i7);
                                arrayList2.add(Page.copy$default(page3, null, null, page3.getPaperOrientation() == PaperOrientation.VERTICAL ? new PaperSpec("Custom", null, false, iIntValue + rect2.left + rect2.right, iIntValue2 + rect2.top + rect2.bottom, null, null, 0, 0, 486, null) : new PaperSpec("Custom", null, false, iIntValue2 + rect2.top + rect2.bottom, iIntValue + rect2.left + rect2.right, null, null, 0, 0, 486, null), null, null, page2.getPaddingStyle(), rect2, null, false, 0, 0L, 0L, null, null, 0, false, null, null, null, 524187, null));
                            }
                        }
                        if (iIntValue2 < 5000) {
                        }
                        i7 = 0;
                        Rect rect22 = new Rect(i3, i5, i4, i7);
                        arrayList2.add(Page.copy$default(page3, null, null, page3.getPaperOrientation() == PaperOrientation.VERTICAL ? new PaperSpec("Custom", null, false, iIntValue + rect22.left + rect22.right, iIntValue2 + rect22.top + rect22.bottom, null, null, 0, 0, 486, null) : new PaperSpec("Custom", null, false, iIntValue2 + rect22.top + rect22.bottom, iIntValue + rect22.left + rect22.right, null, null, 0, 0, 486, null), null, null, page2.getPaddingStyle(), rect22, null, false, 0, 0L, 0L, null, null, 0, false, null, null, null, 524187, null));
                    }
                    i = i6;
                    i10 = i11;
                }
                arrayList = null;
                arrayList3 = arrayList2;
                noteContent2 = noteContent;
                C27449o00O0OoO c27449o00O0OoO = c29423OooO00o.f104361OooO0Oo;
                String str2 = (String) c29423OooO00o.f104360OooO.getValue();
                this.f104463OooOo0o = noteContent2;
                this.f104462OooOo = arrayList3;
                this.f104465OooOoO0 = arrayList;
                this.f104468OooOoo0 = 3;
                objOoooO0O = c27449o00O0OoO.OoooO0O(str2, arrayList3, this);
                list = arrayList3;
                if (objOoooO0O != enumC32485OooO00o) {
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(ExecutorC33873OooO0O0.f122045OooOoO0), null, null, new OooO00o(list, c29423OooO00o, noteContent2, null), 3);
                    C33772OooooOo c33772OooooOo = c29423OooO00o.f104381OooOoO;
                    Integer num = new Integer(0);
                    this.f104463OooOo0o = null;
                    this.f104462OooOo = null;
                    this.f104468OooOoo0 = 4;
                }
                return enumC32485OooO00o;
            }
            if (i8 != 3) {
                if (i8 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            List list2 = (List) this.f104462OooOo;
            noteContent2 = (NoteContent) this.f104463OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            list = list2;
            C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(ExecutorC33873OooO0O0.f122045OooOoO0), null, null, new OooO00o(list, c29423OooO00o, noteContent2, null), 3);
            C33772OooooOo c33772OooooOo2 = c29423OooO00o.f104381OooOoO;
            Integer num2 = new Integer(0);
            this.f104463OooOo0o = null;
            this.f104462OooOo = null;
            this.f104468OooOoo0 = 4;
        }
        page2 = page;
        noteContent = (NoteContent) objOooOoO0;
        if (noteContent == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("PagePaddingViewModel");
            c20358OooO00o2.OooO0OO("Note content is null", new Object[0]);
            return C32460OooOooO.f116667OooO00o;
        }
        List<Page> pages = noteContent.getPages();
        ArrayList arrayList5 = new ArrayList(C34428OooOOo.OooOOoo(pages, 10));
        Iterator<T> it = pages.iterator();
        while (it.hasNext()) {
            arrayList5.add(((Page) it.next()).getId());
        }
        int iIndexOf = arrayList5.indexOf(page2.getId());
        if (iIndexOf == -1) {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("PagePaddingViewModel");
            c20358OooO00o3.OooO0OO("Composed page is not in the note", new Object[0]);
            return C32460OooOooO.f116667OooO00o;
        }
        boolean zBooleanValue = ((Boolean) c29423OooO00o.f104377OooOo0.f121747OooOo0o.getValue()).booleanValue();
        int i14 = (((Boolean) c29423OooO00o.f104379OooOo0O.f121747OooOo0o.getValue()).booleanValue() || iIndexOf == 0) ? 1 : 0;
        ArrayList arrayList6 = new ArrayList();
        if (!zBooleanValue) {
            arrayList = null;
            arrayList6.add(page2);
            arrayList3 = arrayList6;
            noteContent2 = noteContent;
            C27449o00O0OoO c27449o00O0OoO2 = c29423OooO00o.f104361OooO0Oo;
            String str22 = (String) c29423OooO00o.f104360OooO.getValue();
            this.f104463OooOo0o = noteContent2;
            this.f104462OooOo = arrayList3;
            this.f104465OooOoO0 = arrayList;
            this.f104468OooOoo0 = 3;
            objOoooO0O = c27449o00O0OoO2.OoooO0O(str22, arrayList3, this);
            list = arrayList3;
            if (objOoooO0O != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        String id = noteContent.getId();
        this.f104463OooOo0o = page2;
        this.f104462OooOo = noteContent;
        this.f104465OooOoO0 = arrayList6;
        this.f104464OooOoO = iIndexOf;
        this.f104466OooOoOO = i14;
        this.f104468OooOoo0 = 2;
        objOooo00o = c29423OooO00o.f104361OooO0Oo.Oooo00o(id, arrayList5, this);
        if (objOooo00o != enumC32485OooO00o) {
            arrayList2 = arrayList6;
            i = iIndexOf;
            i2 = i14;
            int i102 = 0;
            while (r8.hasNext()) {
            }
            arrayList = null;
            arrayList3 = arrayList2;
            noteContent2 = noteContent;
            C27449o00O0OoO c27449o00O0OoO22 = c29423OooO00o.f104361OooO0Oo;
            String str222 = (String) c29423OooO00o.f104360OooO.getValue();
            this.f104463OooOo0o = noteContent2;
            this.f104462OooOo = arrayList3;
            this.f104465OooOoO0 = arrayList;
            this.f104468OooOoo0 = 3;
            objOoooO0O = c27449o00O0OoO22.OoooO0O(str222, arrayList3, this);
            list = arrayList3;
            if (objOoooO0O != enumC32485OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }
}
