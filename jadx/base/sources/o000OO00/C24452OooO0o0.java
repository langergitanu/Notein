package o000OO00;

import androidx.ink.brush.BrushBehaviorNative;
import com.aspose.words.ControlChar;
import com.orion.notein.p607ui.noteeditor.noteswitch.NoteEditorSwitchFragment;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import o0OoO0o.AbstractC28656OooOOO0;
import oO00ooO.C32460OooOooO;
import oO0o.AbstractC33534OooOO0o;
import oO0o.InterfaceC33531OooO0o0;
import oOo000Oo.C34426OooOO0o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34436OooOoOO;
import oOo000Oo.C34444Oooo0O0;
import oOo00O0O.AbstractC34457OooO0OO;
import oOo00O0O.C34461OooO0oo;
import ooOOoOO0.C35127OooOOoo;
import ooOOoOO0.C35129OooOo0O;

/* JADX INFO: renamed from: o000OO00.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24452OooO0o0 implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f82637OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f82638OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f82639OooOoO0;

    public /* synthetic */ C24452OooO0o0(int i, Object obj, Object obj2) {
        this.f82638OooOo0o = i;
        this.f82637OooOo = obj;
        this.f82639OooOoO0 = obj2;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        String[] strArrNames;
        switch (this.f82638OooOo0o) {
            case 0:
                C24453OooO0oO.f82640OooO0Oo.getClass();
                C34426OooOO0o c34426OooOO0o = new C34426OooOO0o();
                C34426OooOO0o c34426OooOO0o2 = new C34426OooOO0o((List) this.f82637OooOo);
                while (!c34426OooOO0o2.isEmpty()) {
                    AbstractC28656OooOOO0 abstractC28656OooOOO0 = (AbstractC28656OooOOO0) c34426OooOO0o2.removeLast();
                    c34426OooOO0o.addFirst(abstractC28656OooOOO0);
                    c34426OooOO0o2.addAll(abstractC28656OooOOO0.f101555OooO00o);
                }
                BrushBehaviorNative brushBehaviorNative = BrushBehaviorNative.f65345OooO00o;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(c34426OooOO0o, 10));
                Iterator<E> it = c34426OooOO0o.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((AbstractC28656OooOOO0) it.next()).OooO00o()));
                }
                return Long.valueOf(brushBehaviorNative.createFromOrderedNodes(oOo000Oo.OooOo.o0ooOOo(arrayList), (String) this.f82639OooOoO0));
            case 1:
                NoteEditorSwitchFragment noteEditorSwitchFragment = (NoteEditorSwitchFragment) this.f82637OooOo;
                noteEditorSwitchFragment.OooOoo().OooOOoo(((NoteVO) this.f82639OooOoO0).getId());
                noteEditorSwitchFragment.OooOoOO();
                return C32460OooOooO.f116667OooO00o;
            default:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                AbstractC34457OooO0OO abstractC34457OooO0OO = (AbstractC34457OooO0OO) this.f82639OooOoO0;
                C34461OooO0oo c34461OooO0oo = abstractC34457OooO0OO.f123491OooO00o;
                InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = (InterfaceC33531OooO0o0) this.f82637OooOo;
                C35129OooOo0O.OooO0OO(interfaceC33531OooO0o0, abstractC34457OooO0OO);
                int iOooO0o0 = interfaceC33531OooO0o0.OooO0o0();
                for (int i = 0; i < iOooO0o0; i++) {
                    List<Annotation> listOooO0oO = interfaceC33531OooO0o0.OooO0oO(i);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : listOooO0oO) {
                        if (obj instanceof oOo00O0O.OooOo) {
                            arrayList2.add(obj);
                        }
                    }
                    oOo00O0O.OooOo oooOo = (oOo00O0O.OooOo) oOo000Oo.OooOo.o0OoOo0(arrayList2);
                    if (oooOo != null && (strArrNames = oooOo.names()) != null) {
                        for (String str : strArrNames) {
                            String str2 = kotlin.jvm.internal.OooOOO0.OooO0O0(interfaceC33531OooO0o0.getKind(), AbstractC33534OooOO0o.OooO0O0.f121131OooO00o) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str)) {
                                String message = "The suggested name '" + str + "' for " + str2 + ControlChar.SPACE_CHAR + interfaceC33531OooO0o0.OooO0o(i) + " is already one of the names for " + str2 + ControlChar.SPACE_CHAR + interfaceC33531OooO0o0.OooO0o(((Number) C34444Oooo0O0.OooO0oO(str, linkedHashMap)).intValue()) + " in " + interfaceC33531OooO0o0;
                                kotlin.jvm.internal.OooOOO0.OooO0oO(message, "message");
                                throw new C35127OooOOoo(message);
                            }
                            linkedHashMap.put(str, Integer.valueOf(i));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? C34436OooOoOO.f123455OooOo0o : linkedHashMap;
        }
    }
}
