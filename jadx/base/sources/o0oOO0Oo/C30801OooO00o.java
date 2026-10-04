package o0oOO0Oo;

import OooOoO.C20504OooO0O0;
import Oooo0.o000000O;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.InputDeviceCompat;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.aspose.slides.C22205OooOOo;
import com.facebook.drawee.view.SimpleDraweeView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o00ooO0o.C25763OooO00o;
import o00ooO0o.C25764OooO0O0;
import o0O0o0oO.o000000;
import o0oOO0Oo.C30801OooO00o;

/* JADX INFO: renamed from: o0oOO0Oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30801OooO00o extends AbstractC22050OooOo0o<NoteVO, OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public o000000 f110089OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public ViewOnContextClickListenerC30808OooO0oo f110090OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ViewOnLongClickListenerC30804OooO0Oo f110091OooO0Oo;

    /* JADX INFO: renamed from: o0oOO0Oo.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20127OooO00o extends OooOOO.AbstractC22036OooO0o0<NoteVO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C20127OooO00o f110092OooO00o = new C20127OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(NoteVO noteVO, NoteVO noteVO2) {
            return noteVO.equals(noteVO2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(NoteVO noteVO, NoteVO noteVO2) {
            return noteVO.getOrientation() == noteVO2.getOrientation();
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final Object OooO0OO(NoteVO noteVO, NoteVO noteVO2) {
            NoteVO noteVO3 = noteVO;
            NoteVO noteVO4 = noteVO2;
            if (noteVO3.getType() == noteVO4.getType() && kotlin.jvm.internal.OooOOO0.OooO0O0(noteVO3.getId(), noteVO4.getId())) {
                if (!kotlin.jvm.internal.OooOOO0.OooO0O0(noteVO3.getTnPath(), noteVO4.getTnPath()) || noteVO3.getLastModificationTime() != noteVO4.getLastModificationTime() || noteVO3.getLocked() != noteVO4.getLocked() || noteVO3.getLockAdded() != noteVO4.getLockAdded()) {
                    return C22205OooOOo.OooO0O0("needRefresh", true);
                }
                if (noteVO3.getInSelectMode() == noteVO4.getInSelectMode() && kotlin.jvm.internal.OooOOO0.OooO0O0(noteVO3.getHighLightText(), noteVO4.getHighLightText()) && !kotlin.jvm.internal.OooOOO0.OooO0O0(noteVO3.getPlaceHolderState(), noteVO4.getPlaceHolderState())) {
                    return C22205OooOOo.OooO0O0("needRefresh", false);
                }
                return C22205OooOOo.OooO0O0("needRefresh", false);
            }
            return C22205OooOOo.OooO0O0("needRefresh", true);
        }
    }

    /* JADX INFO: renamed from: o0oOO0Oo.OooO00o$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final SimpleDateFormat f110093OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TextView f110094OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final SimpleDraweeView f110095OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final View f110096OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final TextView f110097OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final ImageView f110098OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final ImageView f110099OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final TextView f110100OooO0oo;

        public OooO0O0(C30801OooO00o c30801OooO00o, View view) {
            super(view);
            this.f110093OooO00o = new SimpleDateFormat("yy/MM/dd", Locale.CHINA);
            View viewFindViewById = view.findViewById(R.id.title);
            kotlin.jvm.internal.OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
            this.f110094OooO0O0 = (TextView) viewFindViewById;
            this.f110095OooO0OO = (SimpleDraweeView) view.findViewById(R.id.cover);
            this.f110096OooO0Oo = view.findViewById(R.id.cover_wrapper);
            ImageView imageView = (ImageView) view.findViewById(R.id.more);
            this.f110098OooO0o0 = imageView;
            this.f110097OooO0o = (TextView) view.findViewById(R.id.creation_time);
            ImageView imageView2 = (ImageView) view.findViewById(R.id.is_favorite);
            this.f110099OooO0oO = imageView2;
            this.f110100OooO0oo = (TextView) view.findViewById(R.id.total_pages);
            view.setOnHoverListener(new View.OnHoverListener() { // from class: o0oOO0Oo.OooO0O0
                @Override // android.view.View.OnHoverListener
                public final boolean onHover(View view2, MotionEvent motionEvent) {
                    int actionMasked = motionEvent.getActionMasked();
                    C30801OooO00o.OooO0O0 oooO0O0 = this.f110101OooO00o;
                    if (actionMasked == 9) {
                        oooO0O0.f110096OooO0Oo.setTranslationZ(o000000O.OooO0o0(6.0f));
                        View view3 = oooO0O0.f110096OooO0Oo;
                        view3.setScaleX(1.01f);
                        view3.setScaleY(1.01f);
                        return false;
                    }
                    if (actionMasked != 10) {
                        return false;
                    }
                    oooO0O0.f110096OooO0Oo.setTranslationZ(0.0f);
                    View view4 = oooO0O0.f110096OooO0Oo;
                    view4.setScaleX(1.0f);
                    view4.setScaleY(1.0f);
                    return false;
                }
            });
            o000000 o000000Var = c30801OooO00o.f110089OooO0O0;
            if (o000000Var != null) {
                this.itemView.setOnClickListener(o000000Var);
                imageView.setOnClickListener(o000000Var);
                imageView2.setOnClickListener(o000000Var);
            }
            ViewOnContextClickListenerC30808OooO0oo viewOnContextClickListenerC30808OooO0oo = c30801OooO00o.f110090OooO0OO;
            if (viewOnContextClickListenerC30808OooO0oo != null) {
                view.setOnContextClickListener(viewOnContextClickListenerC30808OooO0oo);
            }
            ViewOnLongClickListenerC30804OooO0Oo viewOnLongClickListenerC30804OooO0Oo = c30801OooO00o.f110091OooO0Oo;
            if (viewOnLongClickListenerC30804OooO0Oo != null) {
                view.setOnLongClickListener(viewOnLongClickListenerC30804OooO0Oo);
            }
            view.post(new Runnable() { // from class: o0oOO0Oo.OooO0OO
                @Override // java.lang.Runnable
                public final void run() {
                    C30801OooO00o.OooO0O0 oooO0O0 = this.f110102OooOo0o;
                    Object parent = oooO0O0.f110098OooO0o0.getParent();
                    kotlin.jvm.internal.OooOOO0.OooO0o0(parent, "null cannot be cast to non-null type android.view.View");
                    ImageView btnMore = oooO0O0.f110098OooO0o0;
                    kotlin.jvm.internal.OooOOO0.OooO0o(btnMore, "btnMore");
                    ((View) parent).setTouchDelegate(new TouchDelegate(C30801OooO00o.OooO0O0.OooO0O0(o000000O.OooO0o(8), btnMore), btnMore));
                    ImageView imageView3 = oooO0O0.f110099OooO0oO;
                    Object parent2 = imageView3.getParent();
                    kotlin.jvm.internal.OooOOO0.OooO0o0(parent2, "null cannot be cast to non-null type android.view.View");
                    ((View) parent2).setTouchDelegate(new TouchDelegate(C30801OooO00o.OooO0O0.OooO0O0(o000000O.OooO0o(8), imageView3), imageView3));
                }
            });
        }

        public static Rect OooO0O0(int i, View view) {
            Rect rect = new Rect();
            view.getHitRect(rect);
            rect.left -= i;
            rect.top -= i;
            rect.right += i;
            rect.bottom += i;
            return rect;
        }

        public final void OooO00o(NoteVO noteVO, boolean z) {
            this.itemView.setTag(noteVO);
            this.f110098OooO0o0.setTag(noteVO);
            ImageView imageView = this.f110099OooO0oO;
            imageView.setTag(noteVO);
            String name = noteVO.getName();
            String highLightText = noteVO.getHighLightText();
            SpannableString spannableString = new SpannableString(name);
            if (highLightText != null && highLightText.length() != 0) {
                Pattern patternCompile = Pattern.compile(highLightText, 2);
                kotlin.jvm.internal.OooOOO0.OooO0o(patternCompile, "compile(...)");
                Matcher matcher = patternCompile.matcher(spannableString);
                kotlin.jvm.internal.OooOOO0.OooO0o(matcher, "matcher(...)");
                while (matcher.find()) {
                    spannableString.setSpan(new BackgroundColorSpan(InputDeviceCompat.SOURCE_ANY), matcher.start(), matcher.end(), 33);
                }
            }
            this.f110094OooO0O0.setText(spannableString);
            if (z) {
                boolean lockAdded = noteVO.getLockAdded();
                SimpleDraweeView cover = this.f110095OooO0OO;
                if (lockAdded) {
                    int i = noteVO.getLocked() ? noteVO.getWidth() > noteVO.getHeight() ? R.drawable.ic_cover_locked_h : R.drawable.ic_cover_locked_v : noteVO.getWidth() > noteVO.getHeight() ? R.drawable.ic_cover_no_locked_h : R.drawable.ic_cover_no_locked_v;
                    int width = noteVO.getWidth();
                    int height = noteVO.getHeight();
                    kotlin.jvm.internal.OooOOO0.OooO0o(cover, "cover");
                    C25764OooO0O0 c25764OooO0O0OooO0o0 = C25764OooO0O0.OooO0o0(i);
                    c25764OooO0O0OooO0o0.OooO0O0();
                    c25764OooO0O0OooO0o0.OooO0OO();
                    C25763OooO00o c25763OooO00oOooO00o = c25764OooO0O0OooO0o0.OooO00o();
                    ViewGroup.LayoutParams layoutParams = cover.getLayoutParams();
                    layoutParams.width = width;
                    layoutParams.height = height;
                    cover.requestLayout();
                    cover.setImageRequest(c25763OooO00oOooO00o);
                } else if (noteVO.getTnPath().length() > 0) {
                    String tnPath = noteVO.getTnPath();
                    int width2 = noteVO.getWidth();
                    int height2 = noteVO.getHeight();
                    kotlin.jvm.internal.OooOOO0.OooO0o(cover, "cover");
                    C25764OooO0O0 c25764OooO0O0OooO0o = C25764OooO0O0.OooO0o(Uri.fromFile(new File(tnPath)));
                    c25764OooO0O0OooO0o.OooO0O0();
                    c25764OooO0O0OooO0o.OooO0OO();
                    C25763OooO00o c25763OooO00oOooO00o2 = c25764OooO0O0OooO0o.OooO00o();
                    ViewGroup.LayoutParams layoutParams2 = cover.getLayoutParams();
                    layoutParams2.width = width2;
                    layoutParams2.height = height2;
                    cover.requestLayout();
                    cover.setImageRequest(c25763OooO00oOooO00o2);
                } else {
                    cover.setImageResource(android.R.color.transparent);
                }
            }
            TextView textView = this.f110100OooO0oo;
            textView.setVisibility(0);
            TextView textView2 = this.f110097OooO0o;
            textView2.setVisibility(0);
            if (noteVO.getInSelectMode() && noteVO.isSelected()) {
                View view = this.itemView;
                view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.item_bg_color_pressed));
            } else {
                View view2 = this.itemView;
                view2.setBackgroundColor(ContextCompat.getColor(view2.getContext(), android.R.color.transparent));
            }
            imageView.setVisibility((noteVO.getType() == 2 || noteVO.getType() == 3) ? 8 : 0);
            imageView.setSelected(noteVO.isFavorite());
            String creationTimeStr = noteVO.getCreationTimeStr();
            if (creationTimeStr == null) {
                creationTimeStr = this.f110093OooO00o.format(Long.valueOf(noteVO.getCreationTime()));
            }
            textView2.setText(creationTimeStr);
            textView.setText(noteVO.getType() == 0 ? this.itemView.getContext().getString(R.string.note_num_of_pages, Integer.valueOf(noteVO.getTotalPages())) : noteVO.getType() == 1 ? this.itemView.getContext().getString(R.string.folder_num_of_notes, Integer.valueOf(noteVO.getTotalPages())) : "");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        NoteVO noteVOOooO0OO = OooO0OO(i);
        kotlin.jvm.internal.OooOOO0.OooO0o(noteVOOooO0OO, "getItem(...)");
        holder.OooO00o(noteVOOooO0OO, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_editor_recent_note, viewGroup, false);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewOooO0OO);
        return new OooO0O0(this, viewOooO0OO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i, List payloads) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        kotlin.jvm.internal.OooOOO0.OooO0oO(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i, payloads);
            return;
        }
        Object obj = payloads.get(0);
        kotlin.jvm.internal.OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type android.os.Bundle");
        if (!((Bundle) obj).getBoolean("needRefresh")) {
            NoteVO noteVOOooO0OO = OooO0OO(i);
            kotlin.jvm.internal.OooOOO0.OooO0o(noteVOOooO0OO, "getItem(...)");
            holder.OooO00o(noteVOOooO0OO, false);
            return;
        }
        super.onBindViewHolder(holder, i, payloads);
    }
}
