package com.orion.notein.richeditor.converter;

/* JADX INFO: loaded from: classes9.dex */
public class HtmlParagraphStyle {
    protected final ParagraphType mType;

    /* JADX INFO: renamed from: com.orion.notein.richeditor.converter.HtmlParagraphStyle$1 */
    public static /* synthetic */ class C188991 {
        static final /* synthetic */ int[] $SwitchMap$com$orion$notein$richeditor$converter$ParagraphType;

        static {
            int[] iArr = new int[ParagraphType.values().length];
            $SwitchMap$com$orion$notein$richeditor$converter$ParagraphType = iArr;
            try {
                iArr[ParagraphType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$orion$notein$richeditor$converter$ParagraphType[ParagraphType.BULLET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$orion$notein$richeditor$converter$ParagraphType[ParagraphType.NUMBERING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$orion$notein$richeditor$converter$ParagraphType[ParagraphType.INDENTATION_OL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$orion$notein$richeditor$converter$ParagraphType[ParagraphType.INDENTATION_UL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$orion$notein$richeditor$converter$ParagraphType[ParagraphType.ALIGNMENT_LEFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$orion$notein$richeditor$converter$ParagraphType[ParagraphType.ALIGNMENT_RIGHT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$orion$notein$richeditor$converter$ParagraphType[ParagraphType.ALIGNMENT_CENTER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public HtmlParagraphStyle(ParagraphType paragraphType) {
        this.mType = paragraphType;
    }

    public boolean endTagAddsLineBreak() {
        switch (C188991.$SwitchMap$com$orion$notein$richeditor$converter$ParagraphType[this.mType.ordinal()]) {
        }
        return false;
    }

    public String getEndTag() {
        switch (C188991.$SwitchMap$com$orion$notein$richeditor$converter$ParagraphType[this.mType.ordinal()]) {
            case 1:
                return "";
            case 2:
                return "</ul>";
            case 3:
            case 4:
                return "</ol>";
            case 5:
                return "</ul>";
            case 6:
            case 7:
            case 8:
                return "</div>";
            default:
                return "";
        }
    }

    public String getListEndTag() {
        switch (C188991.$SwitchMap$com$orion$notein$richeditor$converter$ParagraphType[this.mType.ordinal()]) {
        }
        return "";
    }

    public String getListStartTag() {
        switch (C188991.$SwitchMap$com$orion$notein$richeditor$converter$ParagraphType[this.mType.ordinal()]) {
        }
        return "";
    }

    public String getStartTag() {
        switch (C188991.$SwitchMap$com$orion$notein$richeditor$converter$ParagraphType[this.mType.ordinal()]) {
        }
        return "";
    }

    public ParagraphType getType() {
        return this.mType;
    }

    public boolean isAlignment() {
        switch (C188991.$SwitchMap$com$orion$notein$richeditor$converter$ParagraphType[this.mType.ordinal()]) {
        }
        return false;
    }

    public boolean isUndefined() {
        return this.mType == ParagraphType.NONE;
    }
}
