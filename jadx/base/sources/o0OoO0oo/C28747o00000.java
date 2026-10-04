package o0OoO0oo;

import android.content.ClipData;
import android.content.ClipDescription;
import android.graphics.PointF;
import android.view.DragEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.orion.notein.domain.models.DragConstants;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import com.orion.notein.p607ui.noteeditor.captureeditor.CaptureEditorPanel;
import com.orion.notein.p607ui.noteeditor.view.NoteEditorContainer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: o0OoO0oo.o00000, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28747o00000 implements NoteEditorContainer.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ NoteEditorContainerFragment f101810OooO00o;

    public C28747o00000(NoteEditorContainerFragment noteEditorContainerFragment) {
        this.f101810OooO00o = noteEditorContainerFragment;
    }

    @Override // com.orion.notein.ui.noteeditor.view.NoteEditorContainer.OooO00o
    public final void OooO00o(Integer num) {
        this.f101810OooO00o.Oooo00O().Oooo0OO(0, num);
    }

    @Override // com.orion.notein.ui.noteeditor.view.NoteEditorContainer.OooO00o
    public final void OooO0O0() {
        NoteEditorContainerFragment noteEditorContainerFragment = this.f101810OooO00o;
        NoteEditorContainerFragment.Oooo0(noteEditorContainerFragment);
        com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = noteEditorContainerFragment.Oooo00O();
        Boolean bool = Boolean.TRUE;
        C33781o00o0O c33781o00o0O = oooO0OOOooo00O.f73377Oooo;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, bool);
    }

    @Override // com.orion.notein.ui.noteeditor.view.NoteEditorContainer.OooO00o
    public final void OooO0OO(int i) {
        this.f101810OooO00o.Oooo00O().Oooo000(i);
    }

    @Override // com.orion.notein.ui.noteeditor.view.NoteEditorContainer.OooO00o
    public final void OooO0Oo() {
        NoteEditorContainerFragment noteEditorContainerFragment = this.f101810OooO00o;
        NoteEditorContainerFragment.Oooo0(noteEditorContainerFragment);
        noteEditorContainerFragment.Oooo00O().OoooO00();
    }

    @Override // com.orion.notein.ui.noteeditor.view.NoteEditorContainer.OooO00o
    public final void OooO0o(View view, DragEvent dragEvent) {
        Integer num;
        NoteEditorContainerFragment noteEditorContainerFragment = this.f101810OooO00o;
        ClipData clipData = dragEvent.getClipData();
        ClipDescription description = clipData.getDescription();
        int i = description.getExtras().getInt("drag_index", -1);
        if (i != -1 && (num = (Integer) oOo000Oo.OooOo.OoooO00(i, NoteEditorContainer.f76968Oooo0o)) != null) {
            Fragment fragmentOooOooO = noteEditorContainerFragment.getChildFragmentManager().OooOooO(num.intValue());
            NoteEditorFragment noteEditorFragment = fragmentOooOooO instanceof NoteEditorFragment ? (NoteEditorFragment) fragmentOooOooO : null;
            if (noteEditorFragment != null) {
                CaptureEditorPanel captureEditorPanel = noteEditorFragment.f73027OooooOO;
                if (captureEditorPanel == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("captureEditorPanel");
                    throw null;
                }
                captureEditorPanel.setVisibility(8);
            }
        }
        int i2 = description.getExtras().getInt("drop_index", -1);
        if (i2 != -1) {
            if (description.getExtras().getInt(DragConstants.NOTEIN_DRAG_DATA_TYPE, -1) == 4) {
                com.orion.notein.p607ui.noteeditor.OooO0OO.OooOo0(noteEditorContainerFragment.Oooo00O(), clipData.getItemAt(0).getText().toString(), i2);
                return;
            }
            Integer num2 = (Integer) oOo000Oo.OooOo.OoooO00(i2, NoteEditorContainer.f76968Oooo0o);
            if (num2 != null) {
                Fragment fragmentOooOooO2 = noteEditorContainerFragment.getChildFragmentManager().OooOooO(num2.intValue());
                NoteEditorFragment noteEditorFragment2 = fragmentOooOooO2 instanceof NoteEditorFragment ? (NoteEditorFragment) fragmentOooOooO2 : null;
                if (noteEditorFragment2 != null) {
                    noteEditorFragment2.OoooOoo(dragEvent);
                }
            }
        }
    }

    @Override // com.orion.notein.ui.noteeditor.view.NoteEditorContainer.OooO00o
    public final void OooO0o0(int i, Integer num, boolean z) {
        com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = this.f101810OooO00o.Oooo00O();
        String strOooOO0O = oooO0OOOooo00O.OooOO0O();
        if (i == -1) {
            if (num != null) {
                oooO0OOOooo00O.Oooo0OO(num.intValue(), null);
                return;
            }
            return;
        }
        C33781o00o0O c33781o00o0O = oooO0OOOooo00O.f73389OoooO0;
        int i2 = 0;
        if (i == 0) {
            if (!z) {
                List list = (List) c33781o00o0O.getValue();
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((C28961o00oOoOO) it.next()).f102615OooO00o.length() == 0) {
                            String[] strArr = {"", strOooOO0O};
                            ArrayList arrayList = new ArrayList(2);
                            while (i2 < 2) {
                                arrayList.add(new C28961o00oOoOO(strArr[i2], "", new PointF(0.0f, 0.0f), null));
                                i2++;
                            }
                            c33781o00o0O.OooOO0(null, arrayList);
                            oooO0OOOooo00O.Oooo000(1);
                        }
                    }
                }
            }
            if (num != null) {
                oooO0OOOooo00O.Oooo0OO(num.intValue(), null);
                return;
            } else {
                oooO0OOOooo00O.Oooo0OO(2, null);
                return;
            }
        }
        if (i == 1) {
            if (!z) {
                List list2 = (List) c33781o00o0O.getValue();
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (((C28961o00oOoOO) it2.next()).f102615OooO00o.length() == 0) {
                            String[] strArr2 = {"", strOooOO0O};
                            ArrayList arrayList2 = new ArrayList(2);
                            while (i2 < 2) {
                                arrayList2.add(new C28961o00oOoOO(strArr2[i2], "", new PointF(0.0f, 0.0f), null));
                                i2++;
                            }
                            c33781o00o0O.OooOO0(null, arrayList2);
                            oooO0OOOooo00O.Oooo000(1);
                        }
                    }
                }
            }
            if (num != null) {
                oooO0OOOooo00O.Oooo0OO(num.intValue(), null);
                return;
            } else {
                oooO0OOOooo00O.Oooo0OO(1, null);
                return;
            }
        }
        if (i == 2) {
            if (!z) {
                List list3 = (List) c33781o00o0O.getValue();
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it3 = list3.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        if (((C28961o00oOoOO) it3.next()).f102615OooO00o.length() == 0) {
                            String[] strArr3 = {strOooOO0O, ""};
                            ArrayList arrayList3 = new ArrayList(2);
                            for (int i3 = 0; i3 < 2; i3++) {
                                arrayList3.add(new C28961o00oOoOO(strArr3[i3], "", new PointF(0.0f, 0.0f), null));
                            }
                            c33781o00o0O.OooOO0(null, arrayList3);
                            oooO0OOOooo00O.Oooo000(0);
                        }
                    }
                }
            }
            if (num != null) {
                oooO0OOOooo00O.Oooo0OO(num.intValue(), null);
                return;
            } else {
                oooO0OOOooo00O.Oooo0OO(2, null);
                return;
            }
        }
        if (i != 3) {
            return;
        }
        if (!z) {
            List list4 = (List) c33781o00o0O.getValue();
            if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                Iterator it4 = list4.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    if (((C28961o00oOoOO) it4.next()).f102615OooO00o.length() == 0) {
                        String[] strArr4 = {strOooOO0O, ""};
                        ArrayList arrayList4 = new ArrayList(2);
                        for (int i4 = 0; i4 < 2; i4++) {
                            arrayList4.add(new C28961o00oOoOO(strArr4[i4], "", new PointF(0.0f, 0.0f), null));
                        }
                        c33781o00o0O.OooOO0(null, arrayList4);
                        oooO0OOOooo00O.Oooo000(0);
                    }
                }
            }
        }
        if (num != null) {
            oooO0OOOooo00O.Oooo0OO(num.intValue(), null);
        } else {
            oooO0OOOooo00O.Oooo0OO(1, null);
        }
    }

    @Override // com.orion.notein.ui.noteeditor.view.NoteEditorContainer.OooO00o
    public final void OooO0oO() {
        NoteEditorContainerFragment noteEditorContainerFragment = this.f101810OooO00o;
        NoteEditorContainerFragment.Oooo0(noteEditorContainerFragment);
        noteEditorContainerFragment.Oooo00O().Oooo();
    }

    @Override // com.orion.notein.ui.noteeditor.view.NoteEditorContainer.OooO00o
    public final void OooO0oo() {
        com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = this.f101810OooO00o.Oooo00O();
        Boolean bool = Boolean.FALSE;
        C33781o00o0O c33781o00o0O = oooO0OOOooo00O.f73377Oooo;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, bool);
    }
}
