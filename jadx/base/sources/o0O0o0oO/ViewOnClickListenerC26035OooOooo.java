package o0O0o0oO;

import Oooo0oO.C21030OooOO0o;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.core.os.BundleKt;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.domain.models.Label;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.label.ItemData;
import com.orion.notein.p607ui.noteeditor.LockNoteFragment;
import com.orion.notein.p607ui.noteeditor.addimage.AbstractImageCropView;
import com.orion.notein.p607ui.noteeditor.addimage.ImageCropEditor;
import com.orion.notein.p607ui.noteeditor.propertypanel.preview.EditorPreviewFragment;
import com.orion.notein.p607ui.noteeditor.recognize.TextRecognizeDialogFragment;
import com.orion.notein.p607ui.notelist.label.LabelListFragment;
import com.orion.notein.p607ui.notelist.label.LabelListFragment.C23685OooO0o0;
import com.orion.notein.p607ui.notelist.label.LabelListFragment.C23686OooO0oO;
import com.orion.notein.p607ui.p609vo.ItemLabelVO;
import com.orion.notein.p607ui.p609vo.NoteVO;
import com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment.OooO0OO;
import com.orion.notein.ui.notelist.label.LabelListFragment.OooO0o;
import com.orion.penkit.models.TextBoxInfo;
import java.util.ArrayList;
import java.util.List;
import o0O0o00.EnumC25982o0000oO;
import o0Oo00o.C28026OooO0OO;
import o0OoOo.C29197OooO0Oo;
import o0o00oOo.C30082o00000Oo;
import o0o0O00O.C30249OooOoO0;
import o0o0o00O.C30762OooO00o;
import o0oo0o.InterfaceC31284OooO0O0;
import o0ooOOoo.C31660OooO0o0;
import o0ooOOoo.InterfaceC31656OooO0O0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32460OooOooO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0O0o0oO.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ViewOnClickListenerC26035OooOooo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f88897OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f88898OooOo0o;

    public /* synthetic */ ViewOnClickListenerC26035OooOooo(Object obj, int i) {
        this.f88898OooOo0o = i;
        this.f88897OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v45, types: [com.orion.editor.PDFView] */
    /* JADX WARN: Type inference failed for: r3v27, types: [oOo000Oo.OooOoO] */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v30, types: [java.util.ArrayList] */
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
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ItemData itemData;
        ?? arrayList;
        List list;
        Object obj = this.f88897OooOo;
        switch (this.f88898OooOo0o) {
            case 0:
                ((C26042Oooo0o0) obj).f88916OooO00o.f88919OooO0O0.OooO00o();
                return;
            case 1:
                ImageCropEditor imageCropEditor = (ImageCropEditor) obj;
                if (imageCropEditor.f73700OooOoo0 != null) {
                    AbstractImageCropView abstractImageCropView = imageCropEditor.f73697OooOoO0;
                    if (abstractImageCropView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("cropView");
                        throw null;
                    }
                    RectF croppedBounds = abstractImageCropView.getCroppedBounds();
                    if (croppedBounds.isEmpty()) {
                        return;
                    }
                    if (croppedBounds.width() < Oooo0.o000000O.OooO0o(10) || croppedBounds.height() < Oooo0.o000000O.OooO0o(10)) {
                        ImageCropEditor.OooO00o oooO00o = imageCropEditor.eventListener;
                        if (oooO00o != null) {
                            oooO00o.onCancel();
                            return;
                        }
                        return;
                    }
                    AbstractImageCropView abstractImageCropView2 = imageCropEditor.f73697OooOoO0;
                    if (abstractImageCropView2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("cropView");
                        throw null;
                    }
                    Bitmap croppedImage = abstractImageCropView2.getCroppedImage();
                    if (croppedImage != null) {
                        ImageCropEditor.OooO00o oooO00o2 = imageCropEditor.eventListener;
                        if (oooO00o2 != null) {
                            oooO00o2.OooO00o(croppedImage, croppedBounds);
                            return;
                        }
                        return;
                    }
                    ImageCropEditor.OooO00o oooO00o3 = imageCropEditor.eventListener;
                    if (oooO00o3 != null) {
                        oooO00o3.onCancel();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                EditorPreviewFragment editorPreviewFragment = (EditorPreviewFragment) obj;
                String str = (String) editorPreviewFragment.OooOoo().f76075OooOOO0.getValue();
                List list2 = (List) editorPreviewFragment.OooOoo().f76074OooOOO.f121747OooOo0o.getValue();
                if (list2.isEmpty()) {
                    editorPreviewFragment.OooOoo0().Oooo0o(1);
                    InterfaceC21987OooOoo viewLifecycleOwner = editorPreviewFragment.getViewLifecycleOwner();
                    kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, editorPreviewFragment.new OooO0OO(str, null), 3);
                    return;
                }
                List<Label> list3 = list2;
                ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list3, 10));
                for (Label label : list3) {
                    arrayList2.add(new ItemLabelVO(label.getId(), label.getName(), label.getColor(), label.getIndex()));
                }
                ItemData itemData2 = new ItemData(null, str, null, 0, 5);
                com.orion.notein.p607ui.notelist.OooO00o oooO00o4 = editorPreviewFragment.f75911Oooo0oO;
                if (oooO00o4 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("itemLabelListPopupWindow");
                    throw null;
                }
                ImageView imageView = editorPreviewFragment.f75905Oooo00O;
                if (imageView != null) {
                    oooO00o4.OooO0o0(imageView, arrayList2, itemData2, 2);
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnAddLabel");
                    throw null;
                }
            case 3:
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.NoteVO");
                final NoteVO noteVO = (NoteVO) tag;
                final LabelListFragment labelListFragment = (LabelListFragment) obj;
                switch (view.getId()) {
                    case R.id.is_favorite /* 2131297840 */:
                        InterfaceC21987OooOoo viewLifecycleOwner2 = labelListFragment.getViewLifecycleOwner();
                        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                        androidx.lifecycle.OooOo oooOoOooO00o = C21989OooOooO.OooO00o(viewLifecycleOwner2);
                        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                        C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, labelListFragment.new C23685OooO0o0(noteVO, null), 2);
                        return;
                    case R.id.iv_update_from_cloud /* 2131298098 */:
                        return;
                    case R.id.label_list_section /* 2131298128 */:
                        if (noteVO.getLabelList().isEmpty()) {
                            return;
                        }
                        if (noteVO.getType() == 0) {
                            itemData = new ItemData(null, noteVO.getId(), null, 0, 5);
                        } else if (noteVO.getType() == 1) {
                            itemData = new ItemData(noteVO.getId(), null, null, 1, 6);
                        } else {
                            if (noteVO.getType() != 2) {
                                C34406OooO00o.f123390OooO00o.OooO0OO(C21532OooOOo.OooO0OO(noteVO.getType(), "NoteListFragment.onItemMoreClick, invalid type: "), new Object[0]);
                                return;
                            }
                            itemData = new ItemData(null, noteVO.getPageNoteId(), noteVO.getId(), 2, 1);
                        }
                        com.orion.notein.p607ui.notelist.OooO00o oooO00o5 = labelListFragment.f77761Oooo0;
                        if (oooO00o5 != null) {
                            oooO00o5.OooO0o0(view, noteVO.getLabelList(), itemData, 0);
                            return;
                        } else {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("itemLabelListPopupWindow");
                            throw null;
                        }
                    case R.id.more /* 2131298276 */:
                        if (noteVO.getType() == 3) {
                            C30082o00000Oo c30082o00000Oo = labelListFragment.f77766Oooo0OO;
                            if (c30082o00000Oo != null) {
                                c30082o00000Oo.OooO0Oo(view, noteVO);
                                return;
                            } else {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("notePlaceholderItemMoreMenu");
                                throw null;
                            }
                        }
                        o0o0O0.OooO oooO = labelListFragment.f77765Oooo0O0;
                        if (oooO != null) {
                            oooO.OooO0OO(view, noteVO);
                            return;
                        } else {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("noteItemMoreMenu");
                            throw null;
                        }
                    case R.id.remove_placeholder /* 2131298565 */:
                        InterfaceC21987OooOoo viewLifecycleOwner3 = labelListFragment.getViewLifecycleOwner();
                        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
                        androidx.lifecycle.OooOo oooOoOooO00o2 = C21989OooOooO.OooO00o(viewLifecycleOwner3);
                        C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                        C33609OooO0oo.OooO0OO(oooOoOooO00o2, ExecutorC33873OooO0O0.f122045OooOoO0, null, labelListFragment.new OooO0o(noteVO, null), 2);
                        return;
                    default:
                        if (noteVO.getInSelectMode()) {
                            labelListFragment.OooOoo().OooOo(noteVO.getType(), noteVO.getId());
                            return;
                        }
                        int type = noteVO.getType();
                        if (type == 0) {
                            LockNoteFragment lockNoteFragmentOooOoo0 = labelListFragment.OooOoo0();
                            InterfaceC21987OooOoo viewLifecycleOwner4 = labelListFragment.getViewLifecycleOwner();
                            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
                            LockNoteFragment.OooOoo(lockNoteFragmentOooOoo0, C21989OooOooO.OooO00o(viewLifecycleOwner4), com.facebook.soloader.OooOo.OooO0oO(noteVO.getId()), new oO0O000o.OooO00o() { // from class: o0o0O00O.OooOOO0
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // oO0O000o.OooO00o
                                public final Object invoke() {
                                    C32443OooOOO c32443OooOOO = new C32443OooOOO(NoteMeta.PROPERTY_NOTE_ID, noteVO.getId());
                                    LabelListFragment labelListFragment2 = labelListFragment;
                                    NoteVO noteVO2 = (NoteVO) ((C32443OooOOO) labelListFragment2.OooOoo().f77161OoooO00.getValue()).f116638OooOo0o;
                                    C28026OooO0OO.OooO00o(C21030OooOO0o.OooO0OO(labelListFragment2), R.id.noteEditorContainerFragment, BundleKt.bundleOf(c32443OooOOO, new C32443OooOOO("source_folder_id", noteVO2 != null ? noteVO2.getId() : null)));
                                    return C32460OooOooO.f116667OooO00o;
                                }
                            });
                            return;
                        }
                        if (type == 1) {
                            InterfaceC21987OooOoo viewLifecycleOwner5 = labelListFragment.getViewLifecycleOwner();
                            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
                            androidx.lifecycle.OooOo oooOoOooO00o3 = C21989OooOooO.OooO00o(viewLifecycleOwner5);
                            C33874OooO0OO c33874OooO0OO3 = C33649OoooOOo.f121328OooO00o;
                            C33609OooO0oo.OooO0OO(oooOoOooO00o3, ExecutorC33873OooO0O0.f122045OooOoO0, null, labelListFragment.new C23686OooO0oO(noteVO, null), 2);
                            return;
                        }
                        if (type == 2) {
                            final String pageNoteId = noteVO.getPageNoteId();
                            if (pageNoteId != null) {
                                LockNoteFragment lockNoteFragmentOooOoo02 = labelListFragment.OooOoo0();
                                InterfaceC21987OooOoo viewLifecycleOwner6 = labelListFragment.getViewLifecycleOwner();
                                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner6, "getViewLifecycleOwner(...)");
                                LockNoteFragment.OooOoo(lockNoteFragmentOooOoo02, C21989OooOooO.OooO00o(viewLifecycleOwner6), com.facebook.soloader.OooOo.OooO0oO(pageNoteId), new oO0O000o.OooO00o() { // from class: o0o0O00O.OooOOO
                                    @Override // oO0O000o.OooO00o
                                    public final Object invoke() {
                                        C28026OooO0OO.OooO00o(C21030OooOO0o.OooO0OO(labelListFragment), R.id.noteEditorContainerFragment, BundleKt.bundleOf(new C32443OooOOO(NoteMeta.PROPERTY_NOTE_ID, pageNoteId), new C32443OooOOO("page_id_string", noteVO.getId())));
                                        return C32460OooOooO.f116667OooO00o;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if (type != 3) {
                            return;
                        }
                        Integer placeHolderState = noteVO.getPlaceHolderState();
                        if (placeHolderState != null && placeHolderState.intValue() == 1) {
                            InterfaceC21987OooOoo viewLifecycleOwner7 = labelListFragment.getViewLifecycleOwner();
                            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner7, "getViewLifecycleOwner(...)");
                            androidx.lifecycle.OooOo oooOoOooO00o4 = C21989OooOooO.OooO00o(viewLifecycleOwner7);
                            C33874OooO0OO c33874OooO0OO4 = C33649OoooOOo.f121328OooO00o;
                            C33609OooO0oo.OooO0OO(oooOoOooO00o4, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30249OooOoO0(labelListFragment, noteVO, null), 2);
                            return;
                        }
                        if ((placeHolderState != null && placeHolderState.intValue() == 2) || placeHolderState == null || placeHolderState.intValue() != 5) {
                            return;
                        }
                        C28026OooO0OO.OooO00o(C21030OooOO0o.OooO0OO(labelListFragment), R.id.pdfPasswordDialogFragment, BundleKt.bundleOf(new C32443OooOOO("id", noteVO.getId())));
                        return;
                }
            case 4:
                TextRecognizeDialogFragment textRecognizeDialogFragment = (TextRecognizeDialogFragment) obj;
                TextBoxInfo textBoxInfo = textRecognizeDialogFragment.OooOoo0();
                C30762OooO00o c30762OooO00o = textRecognizeDialogFragment.f76167Oooo00o;
                if (c30762OooO00o != null) {
                    C32443OooOOO c32443OooOOO = (C32443OooOOO) textRecognizeDialogFragment.OooOoo().f110008OooO0o.getValue();
                    if (c32443OooOOO == null || (list = (List) c32443OooOOO.f116638OooOo0o) == null) {
                        arrayList = C34434OooOoO.f123453OooOo0o;
                    } else {
                        List<InterfaceC31284OooO0O0> list4 = list;
                        arrayList = new ArrayList(C34428OooOOo.OooOOoo(list4, 10));
                        for (InterfaceC31284OooO0O0 interfaceC31284OooO0O0 : list4) {
                            arrayList.add(interfaceC31284OooO0O0.deepCopy(interfaceC31284OooO0O0.getId()));
                        }
                    }
                    kotlin.jvm.internal.OooOOO0.OooO0oO(textBoxInfo, "textBoxInfo");
                    InterfaceC31284OooO0O0.f111702OooO0O0.getClass();
                    RectF rectFOooO00o = InterfaceC31284OooO0O0.OooO00o.OooO00o(1.0f, arrayList);
                    if (rectFOooO00o == null) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("TextRecognizeDialogDelegate");
                        c20358OooO00o.OooO0OO("onTextBoxButtonClicked: recordsBounds is empty", new Object[0]);
                        return;
                    }
                    float fCenterX = rectFOooO00o.centerX();
                    float fCenterY = rectFOooO00o.centerY();
                    RectF rectF = new RectF(textBoxInfo.getBoundingBox(1.0f));
                    ?? r1 = c30762OooO00o.f110017OooO00o;
                    float zoomLevel = r1.getZoomLevel();
                    float fWidth = (rectF.width() * zoomLevel) / 2.0f;
                    float fHeight = (rectF.height() * zoomLevel) / 2.0f;
                    rectF.left = fCenterX - fWidth;
                    rectF.right = fCenterX + fWidth;
                    rectF.top = fCenterY - fHeight;
                    rectF.bottom = fCenterY + fHeight;
                    r1.OooOO0O(arrayList, com.facebook.soloader.OooOo.OooO0oO(TextBoxInfo.copy$default(textBoxInfo, null, null, 0.0f, 0.0f, 0.0f, rectF, 0.0f, 0, null, 0L, 0, null, 4063, null)), EnumC25982o0000oO.f88737OooOoO0);
                    textRecognizeDialogFragment.dismiss();
                    return;
                }
                return;
            default:
                Object tag2 = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag2, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.audio.vo.AudioPlaySpeedVO");
                C29197OooO0Oo c29197OooO0Oo = (C29197OooO0Oo) tag2;
                InterfaceC31656OooO0O0 interfaceC31656OooO0O0 = ((C31660OooO0o0) obj).f113165OooO0O0;
                if (interfaceC31656OooO0O0 != null) {
                    interfaceC31656OooO0O0.OooO0oO(c29197OooO0Oo);
                    return;
                }
                return;
        }
    }
}
