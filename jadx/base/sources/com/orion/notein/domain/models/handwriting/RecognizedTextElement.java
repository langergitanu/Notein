package com.orion.notein.domain.models.handwriting;

import OooO0o.C20424OooO0Oo;
import android.graphics.RectF;
import com.google.firebase.firestore.util.OooOOO;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.C24242OooOOo;
import o0oo0O.C31219OooO0O0;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.C33938OooO0o0;
import oO0oO00.o000000O;
import oO0oO000.OooO0O0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC33908OooO
@Metadata(m80611d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 02\u00020\u0001:\u0003120B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ4\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001e¨\u00063"}, m80612d2 = {"Lcom/orion/notein/domain/models/handwriting/RecognizedTextElement;", "", "", "text", "Landroid/graphics/RectF;", "bounds", "", "Lcom/orion/notein/domain/models/handwriting/RecognizedTextElement$CharElement;", "chars", "<init>", "(Ljava/lang/String;Landroid/graphics/RectF;Ljava/util/List;)V", "", "seen0", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILjava/lang/String;Landroid/graphics/RectF;Ljava/util/List;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self$app_google_playRelease", "(Lcom/orion/notein/domain/models/handwriting/RecognizedTextElement;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Landroid/graphics/RectF;", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Landroid/graphics/RectF;Ljava/util/List;)Lcom/orion/notein/domain/models/handwriting/RecognizedTextElement;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Landroid/graphics/RectF;", "getBounds", "getBounds$annotations", "()V", "Ljava/util/List;", "getChars", "Companion", "CharElement", "$serializer", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class RecognizedTextElement {
    private final RectF bounds;
    private final List<CharElement> chars;
    private final String text;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC33911OooO0OO<Object>[] $childSerializers = {null, null, new C33938OooO0o0(RecognizedTextElement$CharElement$$serializer.INSTANCE)};

    @InterfaceC33908OooO
    @Metadata(m80611d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0019¨\u0006+"}, m80612d2 = {"Lcom/orion/notein/domain/models/handwriting/RecognizedTextElement$CharElement;", "", "", "char", "Landroid/graphics/RectF;", "bounds", "<init>", "(Ljava/lang/String;Landroid/graphics/RectF;)V", "", "seen0", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILjava/lang/String;Landroid/graphics/RectF;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self$app_google_playRelease", "(Lcom/orion/notein/domain/models/handwriting/RecognizedTextElement$CharElement;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Landroid/graphics/RectF;", "copy", "(Ljava/lang/String;Landroid/graphics/RectF;)Lcom/orion/notein/domain/models/handwriting/RecognizedTextElement$CharElement;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getChar", "Landroid/graphics/RectF;", "getBounds", "getBounds$annotations", "()V", "Companion", "$serializer", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class CharElement {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final RectF bounds;
        private final String char;

        @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/orion/notein/domain/models/handwriting/RecognizedTextElement$CharElement$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/orion/notein/domain/models/handwriting/RecognizedTextElement$CharElement;", "serializer", "()LoO0o0ooO/OooO0OO;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final InterfaceC33911OooO0OO<CharElement> serializer() {
                return RecognizedTextElement$CharElement$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                this();
            }
        }

        public /* synthetic */ CharElement(int i, String str, RectF rectF, o000000O o000000o2) {
            if (3 != (i & 3)) {
                C24242OooOOo.OooO0O0(i, 3, RecognizedTextElement$CharElement$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.char = str;
            this.bounds = rectF;
        }

        public static /* synthetic */ CharElement copy$default(CharElement charElement, String str, RectF rectF, int i, Object obj) {
            if ((i & 1) != 0) {
                str = charElement.char;
            }
            if ((i & 2) != 0) {
                rectF = charElement.bounds;
            }
            return charElement.copy(str, rectF);
        }

        @InterfaceC33908OooO(with = C31219OooO0O0.class)
        public static /* synthetic */ void getBounds$annotations() {
        }

        public static final /* synthetic */ void write$Self$app_google_playRelease(CharElement self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
            output.OooOO0o(serialDesc, 0, self.char);
            output.OooOoo0(serialDesc, 1, C31219OooO0O0.f111342OooO00o, self.bounds);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getChar() {
            return this.char;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final RectF getBounds() {
            return this.bounds;
        }

        public final CharElement copy(String str, RectF bounds) {
            OooOOO0.OooO0oO(str, "char");
            OooOOO0.OooO0oO(bounds, "bounds");
            return new CharElement(str, bounds);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CharElement)) {
                return false;
            }
            CharElement charElement = (CharElement) other;
            return OooOOO0.OooO0O0(this.char, charElement.char) && OooOOO0.OooO0O0(this.bounds, charElement.bounds);
        }

        public final RectF getBounds() {
            return this.bounds;
        }

        public final String getChar() {
            return this.char;
        }

        public int hashCode() {
            return this.bounds.hashCode() + (this.char.hashCode() * 31);
        }

        public String toString() {
            return "CharElement(char=" + this.char + ", bounds=" + this.bounds + ")";
        }

        public CharElement(String str, RectF bounds) {
            OooOOO0.OooO0oO(str, "char");
            OooOOO0.OooO0oO(bounds, "bounds");
            this.char = str;
            this.bounds = bounds;
        }
    }

    @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/orion/notein/domain/models/handwriting/RecognizedTextElement$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/orion/notein/domain/models/handwriting/RecognizedTextElement;", "serializer", "()LoO0o0ooO/OooO0OO;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC33911OooO0OO<RecognizedTextElement> serializer() {
            return RecognizedTextElement$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }
    }

    public /* synthetic */ RecognizedTextElement(int i, String str, RectF rectF, List list, o000000O o000000o2) {
        if (7 != (i & 7)) {
            C24242OooOOo.OooO0O0(i, 7, RecognizedTextElement$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.text = str;
        this.bounds = rectF;
        this.chars = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecognizedTextElement copy$default(RecognizedTextElement recognizedTextElement, String str, RectF rectF, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recognizedTextElement.text;
        }
        if ((i & 2) != 0) {
            rectF = recognizedTextElement.bounds;
        }
        if ((i & 4) != 0) {
            list = recognizedTextElement.chars;
        }
        return recognizedTextElement.copy(str, rectF, list);
    }

    @InterfaceC33908OooO(with = C31219OooO0O0.class)
    public static /* synthetic */ void getBounds$annotations() {
    }

    public static final /* synthetic */ void write$Self$app_google_playRelease(RecognizedTextElement self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
        InterfaceC33911OooO0OO<Object>[] interfaceC33911OooO0OOArr = $childSerializers;
        output.OooOO0o(serialDesc, 0, self.text);
        output.OooOoo0(serialDesc, 1, C31219OooO0O0.f111342OooO00o, self.bounds);
        output.OooOoo0(serialDesc, 2, interfaceC33911OooO0OOArr[2], self.chars);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RectF getBounds() {
        return this.bounds;
    }

    public final List<CharElement> component3() {
        return this.chars;
    }

    public final RecognizedTextElement copy(String text, RectF bounds, List<CharElement> chars) {
        OooOOO0.OooO0oO(text, "text");
        OooOOO0.OooO0oO(bounds, "bounds");
        OooOOO0.OooO0oO(chars, "chars");
        return new RecognizedTextElement(text, bounds, chars);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecognizedTextElement)) {
            return false;
        }
        RecognizedTextElement recognizedTextElement = (RecognizedTextElement) other;
        return OooOOO0.OooO0O0(this.text, recognizedTextElement.text) && OooOOO0.OooO0O0(this.bounds, recognizedTextElement.bounds) && OooOOO0.OooO0O0(this.chars, recognizedTextElement.chars);
    }

    public final RectF getBounds() {
        return this.bounds;
    }

    public final List<CharElement> getChars() {
        return this.chars;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.chars.hashCode() + C20424OooO0Oo.OooO0OO(this.bounds, this.text.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.text;
        RectF rectF = this.bounds;
        List<CharElement> list = this.chars;
        StringBuilder sb = new StringBuilder("RecognizedTextElement(text=");
        sb.append(str);
        sb.append(", bounds=");
        sb.append(rectF);
        sb.append(", chars=");
        return OooOOO.OooO0O0(")", sb, list);
    }

    public RecognizedTextElement(String text, RectF bounds, List<CharElement> chars) {
        OooOOO0.OooO0oO(text, "text");
        OooOOO0.OooO0oO(bounds, "bounds");
        OooOOO0.OooO0oO(chars, "chars");
        this.text = text;
        this.bounds = bounds;
        this.chars = chars;
    }
}
