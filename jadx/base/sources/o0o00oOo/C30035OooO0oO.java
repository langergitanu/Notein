package o0o00oOo;

import android.content.Context;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.RunnableC21717Oooo0OO;
import androidx.core.widget.ImageViewCompat;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.aspose.slides.C22227OoooO;
import com.facebook.drawee.view.SimpleDraweeView;
import com.huawei.agconnect.credential.obs.C17625c;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.notelist.LabelListView;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o00ooO0o.C25763OooO00o;
import o00ooO0o.C25764OooO0O0;
import o0o00oOo.C30035OooO0oO;
import o0oo000O.C31183OooO00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34436OooOoOO;
import org.json.JSONException;

/* JADX INFO: renamed from: o0o00oOo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30035OooO0oO extends AbstractC22050OooOo0o<NoteVO, OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public View.OnClickListener f106769OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public View.OnContextClickListener f106770OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f106771OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Map<String, Integer> f106772OooO0o0;

    /* JADX INFO: renamed from: o0o00oOo.OooO0oO$OooO00o */
    public static final class OooO00o extends OooOOO.AbstractC22036OooO0o0<NoteVO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f106773OooO00o = new OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(NoteVO noteVO, NoteVO noteVO2) {
            return noteVO.equals(noteVO2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(NoteVO noteVO, NoteVO noteVO2) {
            return kotlin.jvm.internal.OooOOO0.OooO0O0(noteVO.getId(), noteVO2.getId());
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final Object OooO0OO(NoteVO noteVO, NoteVO noteVO2) {
            NoteVO noteVO3 = noteVO;
            NoteVO noteVO4 = noteVO2;
            Bundle bundle = new Bundle();
            if (noteVO3.getType() != noteVO4.getType()) {
                bundle.putInt(C18437z2.f56754h, noteVO4.getType());
            }
            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(noteVO3.getName(), noteVO4.getName())) {
                bundle.putString("name", noteVO4.getName());
            }
            if (noteVO3.getLastModificationTime() != noteVO4.getLastModificationTime() || !kotlin.jvm.internal.OooOOO0.OooO0O0(noteVO3.getTnPath(), noteVO4.getTnPath())) {
                bundle.putString("tnPath", noteVO4.getTnPath());
            }
            if (noteVO3.getWidth() != noteVO4.getWidth()) {
                bundle.putInt("width", noteVO4.getWidth());
            }
            if (noteVO3.getHeight() != noteVO4.getHeight()) {
                bundle.putInt("height", noteVO4.getHeight());
            }
            if (noteVO3.getOrientation() != noteVO4.getOrientation()) {
                bundle.putSerializable("orientation", noteVO4.getOrientation());
            }
            if (noteVO3.getCreationTime() != noteVO4.getCreationTime()) {
                bundle.putLong(C17625c.f52155b, noteVO4.getCreationTime());
            }
            if (noteVO3.isFavorite() != noteVO4.isFavorite()) {
                bundle.putBoolean("isFavorite", noteVO4.isFavorite());
            }
            if (noteVO3.isSelected() != noteVO4.isSelected()) {
                bundle.putBoolean("isSelected", noteVO4.isSelected());
            }
            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(noteVO3.getHighLightText(), noteVO4.getHighLightText())) {
                bundle.putString("highlightText", noteVO4.getHighLightText());
            }
            if (noteVO3.getTotalPages() != noteVO4.getTotalPages()) {
                bundle.putInt("totalPages", noteVO4.getTotalPages());
            }
            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(noteVO3.getPlaceHolderState(), noteVO4.getPlaceHolderState())) {
                Integer placeHolderState = noteVO4.getPlaceHolderState();
                bundle.putInt("placeholderState", placeHolderState != null ? placeHolderState.intValue() : 0);
            }
            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(noteVO3.getImportProgress(), noteVO4.getImportProgress())) {
                Integer importProgress = noteVO4.getImportProgress();
                bundle.putInt(NotificationCompat.CATEGORY_PROGRESS, importProgress != null ? importProgress.intValue() : 100);
            }
            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(noteVO3.getSortKey(), noteVO4.getSortKey())) {
                Integer sortKey = noteVO4.getSortKey();
                bundle.putInt("sortKey", sortKey != null ? sortKey.intValue() : -1);
            }
            if (noteVO3.getFolderCoverColor() != noteVO4.getFolderCoverColor()) {
                bundle.putInt("folderCoverColor", noteVO4.getFolderCoverColor());
            }
            if (noteVO3.getLocked() != noteVO4.getLocked()) {
                bundle.putBoolean("locked", noteVO4.getLocked());
            }
            if (noteVO3.getLockAdded() != noteVO4.getLockAdded()) {
                bundle.putBoolean("lockAdded", noteVO4.getLockAdded());
            }
            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(noteVO3.getLabelList(), noteVO4.getLabelList())) {
                bundle.putParcelableArrayList("labelList", new ArrayList<>(noteVO4.getLabelList()));
            }
            return bundle;
        }
    }

    /* JADX INFO: renamed from: o0o00oOo.OooO0oO$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final ProgressBar f106774OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final SimpleDateFormat f106775OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TextView f106776OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final SimpleDraweeView f106777OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ProgressBar f106778OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final CardView f106779OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final TextView f106780OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final View f106781OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final ImageView f106782OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final ImageView f106783OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final TextView f106784OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final ImageView f106785OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final TextView f106786OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final ImageView f106787OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final View f106788OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final ViewGroup f106789OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public final LabelListView f106790OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final View f106791OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public final ImageView f106792OooOOoo;

        public OooO0O0(View view) {
            super(view);
            this.f106775OooO00o = new SimpleDateFormat("yy/MM/dd", Locale.CHINA);
            View viewFindViewById = view.findViewById(R.id.title);
            kotlin.jvm.internal.OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
            this.f106776OooO0O0 = (TextView) viewFindViewById;
            this.f106777OooO0OO = (SimpleDraweeView) view.findViewById(R.id.cover);
            this.f106778OooO0Oo = (ProgressBar) view.findViewById(R.id.progress_bar);
            this.f106780OooO0o0 = (TextView) view.findViewById(R.id.tv_progress);
            this.f106779OooO0o = (CardView) view.findViewById(R.id.cover_wrapper);
            this.f106781OooO0oO = view.findViewById(R.id.folder_decor);
            ImageView imageView = (ImageView) view.findViewById(R.id.iv_update_from_cloud);
            this.f106782OooO0oo = imageView;
            this.f106774OooO = (ProgressBar) view.findViewById(R.id.progress_update_from_cloud);
            ImageView imageView2 = (ImageView) view.findViewById(R.id.more);
            this.f106783OooOO0 = imageView2;
            this.f106784OooOO0O = (TextView) view.findViewById(R.id.creation_time);
            this.f106785OooOO0o = (ImageView) view.findViewById(R.id.selected);
            ImageView imageView3 = (ImageView) view.findViewById(R.id.is_favorite);
            this.f106787OooOOO0 = imageView3;
            this.f106786OooOOO = (TextView) view.findViewById(R.id.total_pages);
            View viewFindViewById2 = view.findViewById(R.id.remove_placeholder);
            this.f106788OooOOOO = viewFindViewById2;
            this.f106789OooOOOo = (ViewGroup) view.findViewById(R.id.cl_draggable_view);
            this.f106791OooOOo0 = view.findViewById(R.id.dragging_mask);
            LabelListView labelListView = (LabelListView) view.findViewById(R.id.label_list_section);
            this.f106790OooOOo = labelListView;
            this.f106792OooOOoo = (ImageView) view.findViewById(R.id.iv_cloud_sync_state);
            final Context context = view.getContext();
            view.setOnHoverListener(new View.OnHoverListener() { // from class: o0o00oOo.OooO0oo
                @Override // android.view.View.OnHoverListener
                public final boolean onHover(View view2, MotionEvent motionEvent) {
                    int action = motionEvent.getAction();
                    C30035OooO0oO.OooO0O0 oooO0O0 = this.f106794OooO00o;
                    if (action == 9) {
                        oooO0O0.f106779OooO0o.setTranslationZ(context.getResources().getDimensionPixelSize(R.dimen.default_hovered_translation_z));
                        CardView cardView = oooO0O0.f106779OooO0o;
                        cardView.setScaleX(1.01f);
                        cardView.setScaleY(1.01f);
                        return false;
                    }
                    if (motionEvent.getAction() != 10) {
                        return false;
                    }
                    oooO0O0.f106779OooO0o.setTranslationZ(0.0f);
                    CardView cardView2 = oooO0O0.f106779OooO0o;
                    cardView2.setScaleX(1.0f);
                    cardView2.setScaleY(1.0f);
                    return false;
                }
            });
            View.OnClickListener onClickListener = C30035OooO0oO.this.f106769OooO0O0;
            if (onClickListener != null) {
                imageView2.setOnClickListener(onClickListener);
                this.itemView.setOnClickListener(onClickListener);
                imageView3.setOnClickListener(onClickListener);
                if (viewFindViewById2 != null) {
                    viewFindViewById2.setOnClickListener(onClickListener);
                }
                if (imageView != null) {
                    imageView.setOnClickListener(onClickListener);
                }
                if (labelListView != null) {
                    labelListView.setOnClickListener(onClickListener);
                }
            }
            View.OnContextClickListener onContextClickListener = C30035OooO0oO.this.f106770OooO0OO;
            if (onContextClickListener != null) {
                view.setOnContextClickListener(onContextClickListener);
            }
            view.post(new RunnableC21717Oooo0OO(this, 2));
        }

        public static void OooOOOO(ImageView imageView, int i, int i2) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            int maxWidth = imageView.getMaxWidth();
            int maxHeight = imageView.getMaxHeight();
            if (i > i2) {
                float f = i / i2;
                if (i > maxWidth) {
                    layoutParams.width = maxWidth;
                    layoutParams.height = (int) (maxWidth / f);
                } else {
                    layoutParams.width = i;
                    layoutParams.height = i2;
                }
            } else {
                float f2 = i2 / i;
                if (i2 > maxHeight) {
                    layoutParams.height = maxHeight;
                    layoutParams.width = (int) (maxHeight / f2);
                } else {
                    layoutParams.width = i;
                    layoutParams.height = i2;
                }
            }
            imageView.requestLayout();
        }

        public final void OooO(NoteVO noteVO) {
            String name = noteVO.getName();
            String highLightText = noteVO.getHighLightText();
            int i = C31183OooO00o.f111221OooO00o;
            SpannableString spannableString = new SpannableString(name);
            if (highLightText != null && highLightText.length() != 0) {
                try {
                    String strQuote = Pattern.quote(highLightText);
                    kotlin.jvm.internal.OooOOO0.OooO0o(strQuote, "quote(...)");
                    Matcher matcher = Pattern.compile(strQuote).matcher(spannableString);
                    kotlin.jvm.internal.OooOOO0.OooO0o(matcher, "matcher(...)");
                    while (matcher.find()) {
                        spannableString.setSpan(new BackgroundColorSpan(i), matcher.start(), matcher.end(), 33);
                    }
                } catch (Exception e) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    StringBuilder sbOooO00o = C22227OoooO.OooO00o(c20358OooO00o, "NoteAdapter", "getHighLightString keyWords: ", highLightText, ", originString: ");
                    sbOooO00o.append(name);
                    c20358OooO00o.OooO0Oo(e, sbOooO00o.toString(), new Object[0]);
                }
            }
            this.f106776OooO0O0.setText(spannableString);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final void OooO00o(NoteVO noteVO, Bundle bundle) throws Throwable {
            this.itemView.setTag(noteVO);
            this.f106783OooOO0.setTag(noteVO);
            this.f106787OooOOO0.setTag(noteVO);
            View view = this.f106788OooOOOO;
            if (view != null) {
                view.setTag(noteVO);
            }
            ImageView imageView = this.f106782OooO0oo;
            if (imageView != null) {
                imageView.setTag(noteVO);
            }
            LabelListView labelListView = this.f106790OooOOo;
            if (labelListView != null) {
                labelListView.setTag(noteVO);
            }
            OooOOO();
            OooOOOo();
            if (bundle == null) {
                OooO0O0(noteVO);
                return;
            }
            if (bundle.isEmpty()) {
                OooO0O0(noteVO);
            }
            Set<String> setKeySet = bundle.keySet();
            kotlin.jvm.internal.OooOOO0.OooO0o(setKeySet, "keySet(...)");
            for (String str : setKeySet) {
                if (str != null) {
                    switch (str.hashCode()) {
                        case -2024610847:
                            if (str.equals("sortKey")) {
                                OooO0O0(noteVO);
                            }
                            break;
                        case -1561870626:
                            if (str.equals("placeholderState")) {
                                OooO0o(noteVO);
                                OooOO0o(noteVO);
                                OooO0oO(noteVO);
                                OooO0oo(noteVO);
                            }
                            break;
                        case -1221029593:
                            if (str.equals("height")) {
                                OooOO0(noteVO);
                            }
                            break;
                        case -1097452790:
                            if (str.equals("locked")) {
                                OooOO0(noteVO);
                            }
                            break;
                        case -1001078227:
                            if (str.equals(NotificationCompat.CATEGORY_PROGRESS)) {
                                OooO0oO(noteVO);
                            }
                            break;
                        case -958157163:
                            if (str.equals("lockAdded")) {
                                OooOO0(noteVO);
                            }
                            break;
                        case -869918273:
                            if (str.equals("tnPath")) {
                                OooOO0(noteVO);
                            }
                            break;
                        case -719810848:
                            if (str.equals("totalPages")) {
                                OooOOO0(noteVO);
                            }
                            break;
                        case -607974990:
                            if (str.equals("labelList")) {
                                OooOO0O(noteVO);
                            }
                            break;
                        case 3373707:
                            if (str.equals("name")) {
                                OooO(noteVO);
                            }
                            break;
                        case 3575610:
                            if (str.equals(C18437z2.f56754h)) {
                                OooO0O0(noteVO);
                            }
                            break;
                        case 113126854:
                            if (str.equals("width")) {
                                OooOO0(noteVO);
                            }
                            break;
                        case 257519846:
                            if (str.equals("isFavorite")) {
                                OooO0Oo(noteVO);
                            }
                            break;
                        case 398301669:
                            if (str.equals("isSelected")) {
                                OooO0oo(noteVO);
                            }
                            break;
                        case 1535873025:
                            if (str.equals("cloudSyncState")) {
                                OooO0OO(noteVO);
                            }
                            break;
                        case 1540344833:
                            if (str.equals("highlightText")) {
                                OooO(noteVO);
                            }
                            break;
                        case 1586015820:
                            if (str.equals(C17625c.f52155b)) {
                                TextView textView = this.f106784OooOO0O;
                                if (textView != null) {
                                    String creationTimeStr = noteVO.getCreationTimeStr();
                                    if (creationTimeStr == null) {
                                        creationTimeStr = this.f106775OooO00o.format(Long.valueOf(noteVO.getCreationTime()));
                                    }
                                    textView.setText(creationTimeStr);
                                }
                            }
                            break;
                        case 1642097914:
                            if (str.equals("folderCoverColor")) {
                                OooO0o0(noteVO);
                            }
                            break;
                    }
                }
                OooO0O0(noteVO);
            }
        }

        public final void OooO0O0(NoteVO noteVO) throws Throwable {
            OooO(noteVO);
            OooO0o(noteVO);
            OooO0oO(noteVO);
            OooO0o0(noteVO);
            OooOO0(noteVO);
            OooO0oo(noteVO);
            OooO0Oo(noteVO);
            TextView textView = this.f106784OooOO0O;
            if (textView != null) {
                String creationTimeStr = noteVO.getCreationTimeStr();
                if (creationTimeStr == null) {
                    creationTimeStr = this.f106775OooO00o.format(Long.valueOf(noteVO.getCreationTime()));
                }
                textView.setText(creationTimeStr);
            }
            OooOOO0(noteVO);
            OooOO0o(noteVO);
            OooOO0O(noteVO);
            OooO0OO(noteVO);
        }

        public final void OooO0OO(NoteVO noteVO) {
            Integer num;
            ImageView imageView = this.f106792OooOOoo;
            if (imageView == null) {
                return;
            }
            Map<String, Integer> syncStateMap = C30035OooO0oO.this.f106772OooO0o0;
            kotlin.jvm.internal.OooOOO0.OooO0oO(syncStateMap, "syncStateMap");
            int iIntValue = (noteVO.getType() == 0 && (num = syncStateMap.get(noteVO.getId())) != null) ? num.intValue() : -1;
            if (iIntValue == -1 || iIntValue == 0) {
                imageView.setVisibility(8);
                return;
            }
            if (iIntValue == 1) {
                imageView.setVisibility(0);
                ImageViewCompat.setImageTintList(imageView, ColorStateList.valueOf(ContextCompat.getColor(imageView.getContext(), R.color.notein_accent_yellow)));
            } else if (iIntValue != 2) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                ImageViewCompat.setImageTintList(imageView, ColorStateList.valueOf(ContextCompat.getColor(imageView.getContext(), R.color.notein_accent_pink)));
            }
        }

        public final void OooO0Oo(NoteVO noteVO) {
            ImageView favorite = this.f106787OooOOO0;
            kotlin.jvm.internal.OooOOO0.OooO0o(favorite, "favorite");
            favorite.setVisibility((noteVO.getType() == 2 || noteVO.getType() == 3) ? 8 : 0);
            favorite.setSelected(noteVO.isFavorite());
        }

        public final void OooO0o(NoteVO noteVO) {
            Integer placeHolderState;
            if (noteVO.getType() == 3) {
                Integer placeHolderState2 = noteVO.getPlaceHolderState();
                if (placeHolderState2 != null && placeHolderState2.intValue() == 0) {
                    OooOOo(R.mipmap.ic_note_importing, noteVO.getWidth(), noteVO.getHeight());
                } else if (placeHolderState2 != null && placeHolderState2.intValue() == 1) {
                    OooOOo(R.mipmap.ic_note_import_error, noteVO.getWidth(), noteVO.getHeight());
                } else {
                    SimpleDraweeView cover = this.f106777OooO0OO;
                    if (placeHolderState2 != null && placeHolderState2.intValue() == 2) {
                        int width = noteVO.getWidth();
                        int height = noteVO.getHeight();
                        C25764OooO0O0 c25764OooO0O0OooO0o0 = C25764OooO0O0.OooO0o0(R.drawable.ic_download_from_cloud);
                        c25764OooO0O0OooO0o0.OooO0O0();
                        c25764OooO0O0OooO0o0.OooO0OO();
                        C25763OooO00o c25763OooO00oOooO00o = c25764OooO0O0OooO0o0.OooO00o();
                        kotlin.jvm.internal.OooOOO0.OooO0o(cover, "cover");
                        OooOOOO(cover, width, height);
                        cover.setImageRequest(c25763OooO00oOooO00o);
                    } else if (placeHolderState2 != null && placeHolderState2.intValue() == 5) {
                        int width2 = noteVO.getWidth();
                        int height2 = noteVO.getHeight();
                        C25764OooO0O0 c25764OooO0O0OooO0o02 = C25764OooO0O0.OooO0o0(R.drawable.ic_locked_note_cover);
                        c25764OooO0O0OooO0o02.OooO0O0();
                        c25764OooO0O0OooO0o02.OooO0OO();
                        C25763OooO00o c25763OooO00oOooO00o2 = c25764OooO0O0OooO0o02.OooO00o();
                        kotlin.jvm.internal.OooOOO0.OooO0o(cover, "cover");
                        OooOOOO(cover, width2, height2);
                        cover.setImageRequest(c25763OooO00oOooO00o2);
                    }
                }
            }
            int type = noteVO.getType();
            TextView textView = this.f106786OooOOO;
            TextView textView2 = this.f106784OooOO0O;
            int i = 8;
            View view = this.f106788OooOOOO;
            if (type != 3) {
                if (view != null) {
                    view.setVisibility(8);
                }
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                if (textView != null) {
                    textView.setVisibility(0);
                    return;
                }
                return;
            }
            if (view != null) {
                Integer placeHolderState3 = noteVO.getPlaceHolderState();
                if ((placeHolderState3 != null && placeHolderState3.intValue() == 1) || ((placeHolderState = noteVO.getPlaceHolderState()) != null && placeHolderState.intValue() == 0)) {
                    i = 0;
                }
                view.setVisibility(i);
            }
            if (textView2 != null) {
                textView2.setVisibility(4);
            }
            if (textView != null) {
                textView.setVisibility(4);
            }
        }

        public final void OooO0o0(NoteVO noteVO) {
            if (noteVO.getType() != 3) {
                View folderDecor = this.f106781OooO0oO;
                kotlin.jvm.internal.OooOOO0.OooO0o(folderDecor, "folderDecor");
                folderDecor.setVisibility(noteVO.getType() == 1 ? 0 : 8);
                this.f106779OooO0o.setCardBackgroundColor(noteVO.getType() == 1 ? noteVO.getFolderCoverColor() : -1);
            }
        }

        public final void OooO0oO(NoteVO noteVO) {
            Integer placeHolderState;
            Integer importProgress;
            int type = noteVO.getType();
            TextView textView = this.f106780OooO0o0;
            ProgressBar progressBar = this.f106778OooO0Oo;
            if (type != 3 || (placeHolderState = noteVO.getPlaceHolderState()) == null || placeHolderState.intValue() != 0) {
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                }
                if (textView != null) {
                    textView.setVisibility(8);
                    return;
                }
                return;
            }
            boolean z = noteVO.getImportProgress() != null && ((importProgress = noteVO.getImportProgress()) == null || importProgress.intValue() != 100);
            if (progressBar != null) {
                progressBar.setVisibility(z ? 0 : 8);
            }
            if (textView != null) {
                textView.setVisibility(z ? 0 : 8);
            }
            if (z) {
                if (progressBar != null) {
                    Integer importProgress2 = noteVO.getImportProgress();
                    progressBar.setProgress(importProgress2 != null ? importProgress2.intValue() : 0);
                }
                if (textView != null) {
                    textView.setText(noteVO.getImportProgress() + "%");
                }
            }
        }

        public final void OooO0oo(NoteVO noteVO) {
            Integer placeHolderState;
            int type = noteVO.getType();
            boolean inSelectMode = (type == 0 || type == 1 || type == 2) ? noteVO.getInSelectMode() : false;
            ImageView imageView = this.f106785OooOO0o;
            if (inSelectMode) {
                imageView.setVisibility(0);
                imageView.setSelected(noteVO.isSelected());
            } else {
                imageView.setVisibility(8);
            }
            boolean inSelectMode2 = noteVO.getInSelectMode();
            ImageView btnMore = this.f106783OooOO0;
            if (inSelectMode2) {
                btnMore.setVisibility(8);
                return;
            }
            if (noteVO.getType() == 3 && ((placeHolderState = noteVO.getPlaceHolderState()) == null || placeHolderState.intValue() != 5)) {
                btnMore.setVisibility(8);
            } else {
                kotlin.jvm.internal.OooOOO0.OooO0o(btnMore, "btnMore");
                btnMore.setVisibility(noteVO.getShowMoreBtn() ? 0 : 8);
            }
        }

        public final void OooOO0(NoteVO noteVO) {
            if (noteVO.getType() != 3) {
                if (noteVO.getLockAdded()) {
                    OooOOo(noteVO.getLocked() ? noteVO.getWidth() > noteVO.getHeight() ? R.drawable.ic_cover_locked_h : R.drawable.ic_cover_locked_v : noteVO.getWidth() > noteVO.getHeight() ? R.drawable.ic_cover_no_locked_h : R.drawable.ic_cover_no_locked_v, noteVO.getWidth(), noteVO.getHeight());
                    return;
                }
                int length = noteVO.getTnPath().length();
                SimpleDraweeView cover = this.f106777OooO0OO;
                if (length <= 0) {
                    cover.setImageResource(android.R.color.transparent);
                    OooOOOO(cover, noteVO.getWidth(), noteVO.getHeight());
                    return;
                }
                String tnPath = noteVO.getTnPath();
                int width = noteVO.getWidth();
                int height = noteVO.getHeight();
                kotlin.jvm.internal.OooOOO0.OooO0o(cover, "cover");
                C25764OooO0O0 c25764OooO0O0OooO0o = C25764OooO0O0.OooO0o(Uri.fromFile(new File(tnPath)));
                c25764OooO0O0OooO0o.OooO0O0();
                c25764OooO0O0OooO0o.OooO0OO();
                C25763OooO00o c25763OooO00oOooO00o = c25764OooO0O0OooO0o.OooO00o();
                OooOOOO(cover, width, height);
                cover.setImageRequest(c25763OooO00oOooO00o);
            }
        }

        public final void OooOO0O(NoteVO noteVO) throws Throwable {
            LabelListView labelListView = this.f106790OooOOo;
            if (labelListView != null) {
                labelListView.setVisibility(!noteVO.getLabelList().isEmpty() ? 0 : 8);
            }
            if (labelListView != null) {
                labelListView.setLabels(noteVO.getLabelList());
            }
        }

        public final void OooOO0o(NoteVO noteVO) {
            if (noteVO.getType() == 0) {
                String toUpdateFileId = noteVO.getToUpdateFileId();
                ImageView imageView = this.f106782OooO0oo;
                ProgressBar progressBar = this.f106774OooO;
                if (toUpdateFileId == null || toUpdateFileId.length() == 0) {
                    if (progressBar != null) {
                        progressBar.setVisibility(8);
                    }
                    if (imageView != null) {
                        imageView.setVisibility(8);
                        return;
                    }
                    return;
                }
                Integer placeHolderState = noteVO.getPlaceHolderState();
                if (placeHolderState != null && placeHolderState.intValue() == 4) {
                    if (progressBar != null) {
                        progressBar.setVisibility(0);
                    }
                    if (imageView != null) {
                        imageView.setVisibility(8);
                        return;
                    }
                    return;
                }
                Integer placeHolderState2 = noteVO.getPlaceHolderState();
                if (placeHolderState2 != null && placeHolderState2.intValue() == 3) {
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                    if (progressBar != null) {
                        progressBar.setVisibility(8);
                        return;
                    }
                    return;
                }
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                }
            }
        }

        public final void OooOOO() {
            this.itemView.setTranslationZ(0.0f);
            View view = this.f106791OooOOo0;
            if (view != null) {
                view.setVisibility(8);
            }
        }

        public final void OooOOO0(NoteVO noteVO) {
            TextView textView = this.f106786OooOOO;
            if (textView != null) {
                textView.setText(noteVO.getType() == 0 ? this.itemView.getContext().getString(R.string.note_num_of_pages, Integer.valueOf(noteVO.getTotalPages())) : noteVO.getType() == 1 ? this.itemView.getContext().getString(R.string.folder_num_of_notes, Integer.valueOf(noteVO.getTotalPages())) : "");
            }
        }

        public final void OooOOOo() {
            ViewGroup viewGroup = this.f106789OooOOOo;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
                viewGroup.setTranslationX(0.0f);
                viewGroup.setTranslationY(0.0f);
            }
        }

        public final void OooOOo(int i, int i2, int i3) {
            C25764OooO0O0 c25764OooO0O0OooO0o0 = C25764OooO0O0.OooO0o0(i);
            c25764OooO0O0OooO0o0.OooO0O0();
            c25764OooO0O0OooO0o0.OooO0OO();
            C25763OooO00o c25763OooO00oOooO00o = c25764OooO0O0OooO0o0.OooO00o();
            SimpleDraweeView cover = this.f106777OooO0OO;
            kotlin.jvm.internal.OooOOO0.OooO0o(cover, "cover");
            OooOOOO(cover, i2, i3);
            cover.setImageRequest(c25763OooO00oOooO00o);
        }

        public final void OooOOo0(int i, boolean z) {
            ViewGroup viewGroup = this.f106789OooOOOo;
            if (viewGroup == null || viewGroup.getVisibility() == 0) {
                return;
            }
            Object tag = this.itemView.getTag();
            kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.NoteVO");
            NoteVO noteVO = (NoteVO) tag;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewGroup.findViewById(R.id.dragging_cover);
            if (simpleDraweeView != null) {
                String tnPath = noteVO.getTnPath();
                int width = noteVO.getWidth();
                int height = noteVO.getHeight();
                C25764OooO0O0 c25764OooO0O0OooO0o = C25764OooO0O0.OooO0o(Uri.fromFile(new File(tnPath)));
                c25764OooO0O0OooO0o.OooO0O0();
                c25764OooO0O0OooO0o.OooO0OO();
                C25763OooO00o c25763OooO00oOooO00o = c25764OooO0O0OooO0o.OooO00o();
                OooOOOO(simpleDraweeView, width, height);
                simpleDraweeView.setImageRequest(c25763OooO00oOooO00o);
            }
            View viewFindViewById = viewGroup.findViewById(R.id.dragging_decor_1);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(z ? 0 : 8);
            }
            View viewFindViewById2 = viewGroup.findViewById(R.id.dragging_decor_2);
            if (viewFindViewById2 != null) {
                viewFindViewById2.setVisibility((!z || i <= 2) ? 8 : 0);
            }
            TextView textView = (TextView) viewGroup.findViewById(R.id.dragging_num_tips);
            if (textView != null) {
                textView.setVisibility(z ? 0 : 8);
                textView.setText(String.valueOf(i));
            }
            viewGroup.setVisibility(0);
        }
    }

    public C30035OooO0oO() {
        super(OooO00o.f106773OooO00o);
        this.f106772OooO0o0 = C34436OooOoOO.f123455OooOo0o;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final int getItemViewType(int i) {
        NoteVO noteVOOooO0OO = OooO0OO(i);
        if (this.f106771OooO0Oo) {
            int type = noteVOOooO0OO.getType();
            return (type == 0 || type == 2 || type != 3) ? 2 : 3;
        }
        int type2 = noteVOOooO0OO.getType();
        return (type2 == 0 || type2 == 2 || type2 != 3) ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) throws Throwable {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        NoteVO noteVOOooO0OO = OooO0OO(i);
        kotlin.jvm.internal.OooOOO0.OooO0o(noteVOOooO0OO, "getItem(...)");
        holder.OooO00o(noteVOOooO0OO, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup parent, int i) throws JSONException {
        kotlin.jvm.internal.OooOOO0.OooO0oO(parent, "parent");
        int i2 = R.layout.item_note_list_note_h;
        if (i != 0) {
            if (i == 1) {
                i2 = R.layout.item_layout_note_placeholder_h;
            } else if (i == 2) {
                i2 = R.layout.item_note_list_note_h_in_list_mode;
            } else if (i == 3) {
                i2 = R.layout.item_layout_note_placeholder_h_in_list_mode;
            }
        }
        View viewOooO0O0 = com.aspose.slides.internal.p332p7.OooO0OO.OooO0O0(parent, i2, parent, false);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewOooO0O0);
        return new OooO0O0(viewOooO0O0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i, List payloads) throws Throwable {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        kotlin.jvm.internal.OooOOO0.OooO0oO(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i, payloads);
            return;
        }
        NoteVO noteVOOooO0OO = OooO0OO(i);
        Bundle bundle = new Bundle();
        Iterator it = payloads.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!(next instanceof Bundle)) {
                if (!kotlin.jvm.internal.OooOOO0.OooO0O0(next, "cloudSyncState")) {
                    bundle = null;
                    break;
                }
                bundle.putInt("cloudSyncState", 1);
            } else {
                bundle.putAll((Bundle) next);
            }
        }
        if (bundle == null) {
            kotlin.jvm.internal.OooOOO0.OooO0Oo(noteVOOooO0OO);
            holder.OooO00o(noteVOOooO0OO, null);
        } else {
            kotlin.jvm.internal.OooOOO0.OooO0Oo(noteVOOooO0OO);
            holder.OooO00o(noteVOOooO0OO, bundle);
        }
    }
}
