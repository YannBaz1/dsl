package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ArithmeticExpr'", "'{'", "'operator'", "'newvariable'", "','", "'}'", "'left'", "'right'", "'VariableDeclaration'", "'type'", "'expression'", "'TimeSensors'", "'unit'", "'BooleanExpr'", "'IntExpression'", "'value'", "'Boolean'", "'DistanceSensor'", "'-'", "'ADD'", "'SUB'", "'MUL'", "'DIV'", "'AND'", "'OR'", "'NOT'", "'EQUALS'", "'LESS'", "'GREATER'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ArithmeticExpr";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleArithmeticExpr"
    // InternalMyDsl.g:65:1: entryRuleArithmeticExpr returns [EObject current=null] : iv_ruleArithmeticExpr= ruleArithmeticExpr EOF ;
    public final EObject entryRuleArithmeticExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticExpr = null;


        try {
            // InternalMyDsl.g:65:55: (iv_ruleArithmeticExpr= ruleArithmeticExpr EOF )
            // InternalMyDsl.g:66:2: iv_ruleArithmeticExpr= ruleArithmeticExpr EOF
            {
             newCompositeNode(grammarAccess.getArithmeticExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArithmeticExpr=ruleArithmeticExpr();

            state._fsp--;

             current =iv_ruleArithmeticExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArithmeticExpr"


    // $ANTLR start "ruleArithmeticExpr"
    // InternalMyDsl.g:72:1: ruleArithmeticExpr returns [EObject current=null] : ( () otherlv_1= 'ArithmeticExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleOperator ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? (otherlv_11= 'left' ( (lv_left_12_0= ruleNumberExpr ) ) )? (otherlv_13= 'right' ( (lv_right_14_0= ruleNumberExpr ) ) )? otherlv_15= '}' ) ;
    public final EObject ruleArithmeticExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Enumerator lv_operator_4_0 = null;

        EObject lv_newvariable_7_0 = null;

        EObject lv_newvariable_9_0 = null;

        EObject lv_left_12_0 = null;

        EObject lv_right_14_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( ( () otherlv_1= 'ArithmeticExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleOperator ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? (otherlv_11= 'left' ( (lv_left_12_0= ruleNumberExpr ) ) )? (otherlv_13= 'right' ( (lv_right_14_0= ruleNumberExpr ) ) )? otherlv_15= '}' ) )
            // InternalMyDsl.g:79:2: ( () otherlv_1= 'ArithmeticExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleOperator ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? (otherlv_11= 'left' ( (lv_left_12_0= ruleNumberExpr ) ) )? (otherlv_13= 'right' ( (lv_right_14_0= ruleNumberExpr ) ) )? otherlv_15= '}' )
            {
            // InternalMyDsl.g:79:2: ( () otherlv_1= 'ArithmeticExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleOperator ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? (otherlv_11= 'left' ( (lv_left_12_0= ruleNumberExpr ) ) )? (otherlv_13= 'right' ( (lv_right_14_0= ruleNumberExpr ) ) )? otherlv_15= '}' )
            // InternalMyDsl.g:80:3: () otherlv_1= 'ArithmeticExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleOperator ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? (otherlv_11= 'left' ( (lv_left_12_0= ruleNumberExpr ) ) )? (otherlv_13= 'right' ( (lv_right_14_0= ruleNumberExpr ) ) )? otherlv_15= '}'
            {
            // InternalMyDsl.g:80:3: ()
            // InternalMyDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArithmeticExprAccess().getArithmeticExprAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getArithmeticExprAccess().getArithmeticExprKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getArithmeticExprAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:95:3: (otherlv_3= 'operator' ( (lv_operator_4_0= ruleOperator ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:96:4: otherlv_3= 'operator' ( (lv_operator_4_0= ruleOperator ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getArithmeticExprAccess().getOperatorKeyword_3_0());
                    			
                    // InternalMyDsl.g:100:4: ( (lv_operator_4_0= ruleOperator ) )
                    // InternalMyDsl.g:101:5: (lv_operator_4_0= ruleOperator )
                    {
                    // InternalMyDsl.g:101:5: (lv_operator_4_0= ruleOperator )
                    // InternalMyDsl.g:102:6: lv_operator_4_0= ruleOperator
                    {

                    						newCompositeNode(grammarAccess.getArithmeticExprAccess().getOperatorOperatorEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_operator_4_0=ruleOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArithmeticExprRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_4_0,
                    							"org.xtext.example.mydsl.MyDsl.Operator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:120:3: (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:121:4: otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getArithmeticExprAccess().getNewvariableKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getArithmeticExprAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyDsl.g:129:4: ( (lv_newvariable_7_0= ruleVariableDeclaration ) )
                    // InternalMyDsl.g:130:5: (lv_newvariable_7_0= ruleVariableDeclaration )
                    {
                    // InternalMyDsl.g:130:5: (lv_newvariable_7_0= ruleVariableDeclaration )
                    // InternalMyDsl.g:131:6: lv_newvariable_7_0= ruleVariableDeclaration
                    {

                    						newCompositeNode(grammarAccess.getArithmeticExprAccess().getNewvariableVariableDeclarationParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_newvariable_7_0=ruleVariableDeclaration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArithmeticExprRule());
                    						}
                    						add(
                    							current,
                    							"newvariable",
                    							lv_newvariable_7_0,
                    							"org.xtext.example.mydsl.MyDsl.VariableDeclaration");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:148:4: (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalMyDsl.g:149:5: otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getArithmeticExprAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:153:5: ( (lv_newvariable_9_0= ruleVariableDeclaration ) )
                    	    // InternalMyDsl.g:154:6: (lv_newvariable_9_0= ruleVariableDeclaration )
                    	    {
                    	    // InternalMyDsl.g:154:6: (lv_newvariable_9_0= ruleVariableDeclaration )
                    	    // InternalMyDsl.g:155:7: lv_newvariable_9_0= ruleVariableDeclaration
                    	    {

                    	    							newCompositeNode(grammarAccess.getArithmeticExprAccess().getNewvariableVariableDeclarationParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_newvariable_9_0=ruleVariableDeclaration();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getArithmeticExprRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"newvariable",
                    	    								lv_newvariable_9_0,
                    	    								"org.xtext.example.mydsl.MyDsl.VariableDeclaration");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getArithmeticExprAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:178:3: (otherlv_11= 'left' ( (lv_left_12_0= ruleNumberExpr ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:179:4: otherlv_11= 'left' ( (lv_left_12_0= ruleNumberExpr ) )
                    {
                    otherlv_11=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_11, grammarAccess.getArithmeticExprAccess().getLeftKeyword_5_0());
                    			
                    // InternalMyDsl.g:183:4: ( (lv_left_12_0= ruleNumberExpr ) )
                    // InternalMyDsl.g:184:5: (lv_left_12_0= ruleNumberExpr )
                    {
                    // InternalMyDsl.g:184:5: (lv_left_12_0= ruleNumberExpr )
                    // InternalMyDsl.g:185:6: lv_left_12_0= ruleNumberExpr
                    {

                    						newCompositeNode(grammarAccess.getArithmeticExprAccess().getLeftNumberExprParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_left_12_0=ruleNumberExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArithmeticExprRule());
                    						}
                    						set(
                    							current,
                    							"left",
                    							lv_left_12_0,
                    							"org.xtext.example.mydsl.MyDsl.NumberExpr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:203:3: (otherlv_13= 'right' ( (lv_right_14_0= ruleNumberExpr ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:204:4: otherlv_13= 'right' ( (lv_right_14_0= ruleNumberExpr ) )
                    {
                    otherlv_13=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_13, grammarAccess.getArithmeticExprAccess().getRightKeyword_6_0());
                    			
                    // InternalMyDsl.g:208:4: ( (lv_right_14_0= ruleNumberExpr ) )
                    // InternalMyDsl.g:209:5: (lv_right_14_0= ruleNumberExpr )
                    {
                    // InternalMyDsl.g:209:5: (lv_right_14_0= ruleNumberExpr )
                    // InternalMyDsl.g:210:6: lv_right_14_0= ruleNumberExpr
                    {

                    						newCompositeNode(grammarAccess.getArithmeticExprAccess().getRightNumberExprParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_right_14_0=ruleNumberExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArithmeticExprRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_14_0,
                    							"org.xtext.example.mydsl.MyDsl.NumberExpr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getArithmeticExprAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArithmeticExpr"


    // $ANTLR start "entryRuleNumberExpr"
    // InternalMyDsl.g:236:1: entryRuleNumberExpr returns [EObject current=null] : iv_ruleNumberExpr= ruleNumberExpr EOF ;
    public final EObject entryRuleNumberExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberExpr = null;


        try {
            // InternalMyDsl.g:236:51: (iv_ruleNumberExpr= ruleNumberExpr EOF )
            // InternalMyDsl.g:237:2: iv_ruleNumberExpr= ruleNumberExpr EOF
            {
             newCompositeNode(grammarAccess.getNumberExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberExpr=ruleNumberExpr();

            state._fsp--;

             current =iv_ruleNumberExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberExpr"


    // $ANTLR start "ruleNumberExpr"
    // InternalMyDsl.g:243:1: ruleNumberExpr returns [EObject current=null] : (this_TimeSensors_0= ruleTimeSensors | this_ArithmeticExpr_1= ruleArithmeticExpr | this_IntExpression_2= ruleIntExpression | this_DistanceSensor_3= ruleDistanceSensor ) ;
    public final EObject ruleNumberExpr() throws RecognitionException {
        EObject current = null;

        EObject this_TimeSensors_0 = null;

        EObject this_ArithmeticExpr_1 = null;

        EObject this_IntExpression_2 = null;

        EObject this_DistanceSensor_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:249:2: ( (this_TimeSensors_0= ruleTimeSensors | this_ArithmeticExpr_1= ruleArithmeticExpr | this_IntExpression_2= ruleIntExpression | this_DistanceSensor_3= ruleDistanceSensor ) )
            // InternalMyDsl.g:250:2: (this_TimeSensors_0= ruleTimeSensors | this_ArithmeticExpr_1= ruleArithmeticExpr | this_IntExpression_2= ruleIntExpression | this_DistanceSensor_3= ruleDistanceSensor )
            {
            // InternalMyDsl.g:250:2: (this_TimeSensors_0= ruleTimeSensors | this_ArithmeticExpr_1= ruleArithmeticExpr | this_IntExpression_2= ruleIntExpression | this_DistanceSensor_3= ruleDistanceSensor )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt6=1;
                }
                break;
            case 11:
                {
                alt6=2;
                }
                break;
            case 25:
                {
                alt6=3;
                }
                break;
            case 28:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:251:3: this_TimeSensors_0= ruleTimeSensors
                    {

                    			newCompositeNode(grammarAccess.getNumberExprAccess().getTimeSensorsParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TimeSensors_0=ruleTimeSensors();

                    state._fsp--;


                    			current = this_TimeSensors_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:260:3: this_ArithmeticExpr_1= ruleArithmeticExpr
                    {

                    			newCompositeNode(grammarAccess.getNumberExprAccess().getArithmeticExprParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ArithmeticExpr_1=ruleArithmeticExpr();

                    state._fsp--;


                    			current = this_ArithmeticExpr_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:269:3: this_IntExpression_2= ruleIntExpression
                    {

                    			newCompositeNode(grammarAccess.getNumberExprAccess().getIntExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntExpression_2=ruleIntExpression();

                    state._fsp--;


                    			current = this_IntExpression_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:278:3: this_DistanceSensor_3= ruleDistanceSensor
                    {

                    			newCompositeNode(grammarAccess.getNumberExprAccess().getDistanceSensorParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DistanceSensor_3=ruleDistanceSensor();

                    state._fsp--;


                    			current = this_DistanceSensor_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberExpr"


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:290:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMyDsl.g:290:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyDsl.g:291:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMyDsl.g:297:1: ruleExpression returns [EObject current=null] : (this_TimeSensors_0= ruleTimeSensors | this_ArithmeticExpr_1= ruleArithmeticExpr | this_BooleanExpr_2= ruleBooleanExpr | this_IntExpression_3= ruleIntExpression | this_Boolean_4= ruleBoolean | this_DistanceSensor_5= ruleDistanceSensor ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TimeSensors_0 = null;

        EObject this_ArithmeticExpr_1 = null;

        EObject this_BooleanExpr_2 = null;

        EObject this_IntExpression_3 = null;

        EObject this_Boolean_4 = null;

        EObject this_DistanceSensor_5 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:303:2: ( (this_TimeSensors_0= ruleTimeSensors | this_ArithmeticExpr_1= ruleArithmeticExpr | this_BooleanExpr_2= ruleBooleanExpr | this_IntExpression_3= ruleIntExpression | this_Boolean_4= ruleBoolean | this_DistanceSensor_5= ruleDistanceSensor ) )
            // InternalMyDsl.g:304:2: (this_TimeSensors_0= ruleTimeSensors | this_ArithmeticExpr_1= ruleArithmeticExpr | this_BooleanExpr_2= ruleBooleanExpr | this_IntExpression_3= ruleIntExpression | this_Boolean_4= ruleBoolean | this_DistanceSensor_5= ruleDistanceSensor )
            {
            // InternalMyDsl.g:304:2: (this_TimeSensors_0= ruleTimeSensors | this_ArithmeticExpr_1= ruleArithmeticExpr | this_BooleanExpr_2= ruleBooleanExpr | this_IntExpression_3= ruleIntExpression | this_Boolean_4= ruleBoolean | this_DistanceSensor_5= ruleDistanceSensor )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt7=1;
                }
                break;
            case 11:
                {
                alt7=2;
                }
                break;
            case 24:
                {
                alt7=3;
                }
                break;
            case 25:
                {
                alt7=4;
                }
                break;
            case 26:
            case 27:
                {
                alt7=5;
                }
                break;
            case 28:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:305:3: this_TimeSensors_0= ruleTimeSensors
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getTimeSensorsParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TimeSensors_0=ruleTimeSensors();

                    state._fsp--;


                    			current = this_TimeSensors_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:314:3: this_ArithmeticExpr_1= ruleArithmeticExpr
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getArithmeticExprParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ArithmeticExpr_1=ruleArithmeticExpr();

                    state._fsp--;


                    			current = this_ArithmeticExpr_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:323:3: this_BooleanExpr_2= ruleBooleanExpr
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getBooleanExprParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanExpr_2=ruleBooleanExpr();

                    state._fsp--;


                    			current = this_BooleanExpr_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:332:3: this_IntExpression_3= ruleIntExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getIntExpressionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntExpression_3=ruleIntExpression();

                    state._fsp--;


                    			current = this_IntExpression_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:341:3: this_Boolean_4= ruleBoolean
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getBooleanParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Boolean_4=ruleBoolean();

                    state._fsp--;


                    			current = this_Boolean_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:350:3: this_DistanceSensor_5= ruleDistanceSensor
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getDistanceSensorParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_DistanceSensor_5=ruleDistanceSensor();

                    state._fsp--;


                    			current = this_DistanceSensor_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalMyDsl.g:362:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalMyDsl.g:362:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalMyDsl.g:363:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;

             current =iv_ruleVariableDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalMyDsl.g:369:1: ruleVariableDeclaration returns [EObject current=null] : ( () otherlv_1= 'VariableDeclaration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'expression' otherlv_7= '{' ( (lv_expression_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_expression_10_0= ruleExpression ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_type_5_0 = null;

        EObject lv_expression_8_0 = null;

        EObject lv_expression_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:375:2: ( ( () otherlv_1= 'VariableDeclaration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'expression' otherlv_7= '{' ( (lv_expression_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_expression_10_0= ruleExpression ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalMyDsl.g:376:2: ( () otherlv_1= 'VariableDeclaration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'expression' otherlv_7= '{' ( (lv_expression_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_expression_10_0= ruleExpression ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalMyDsl.g:376:2: ( () otherlv_1= 'VariableDeclaration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'expression' otherlv_7= '{' ( (lv_expression_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_expression_10_0= ruleExpression ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalMyDsl.g:377:3: () otherlv_1= 'VariableDeclaration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'expression' otherlv_7= '{' ( (lv_expression_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_expression_10_0= ruleExpression ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalMyDsl.g:377:3: ()
            // InternalMyDsl.g:378:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableDeclarationAccess().getVariableDeclarationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableDeclarationAccess().getVariableDeclarationKeyword_1());
            		
            // InternalMyDsl.g:388:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:389:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:389:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:390:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVariableDeclarationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getVariableDeclarationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:411:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:412:4: otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getVariableDeclarationAccess().getTypeKeyword_4_0());
                    			
                    // InternalMyDsl.g:416:4: ( (lv_type_5_0= ruleEString ) )
                    // InternalMyDsl.g:417:5: (lv_type_5_0= ruleEString )
                    {
                    // InternalMyDsl.g:417:5: (lv_type_5_0= ruleEString )
                    // InternalMyDsl.g:418:6: lv_type_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_type_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:436:3: (otherlv_6= 'expression' otherlv_7= '{' ( (lv_expression_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_expression_10_0= ruleExpression ) ) )* otherlv_11= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:437:4: otherlv_6= 'expression' otherlv_7= '{' ( (lv_expression_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_expression_10_0= ruleExpression ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getVariableDeclarationAccess().getExpressionKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getVariableDeclarationAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMyDsl.g:445:4: ( (lv_expression_8_0= ruleExpression ) )
                    // InternalMyDsl.g:446:5: (lv_expression_8_0= ruleExpression )
                    {
                    // InternalMyDsl.g:446:5: (lv_expression_8_0= ruleExpression )
                    // InternalMyDsl.g:447:6: lv_expression_8_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getVariableDeclarationAccess().getExpressionExpressionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_expression_8_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                    						}
                    						add(
                    							current,
                    							"expression",
                    							lv_expression_8_0,
                    							"org.xtext.example.mydsl.MyDsl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:464:4: (otherlv_9= ',' ( (lv_expression_10_0= ruleExpression ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==15) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalMyDsl.g:465:5: otherlv_9= ',' ( (lv_expression_10_0= ruleExpression ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_16); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getVariableDeclarationAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMyDsl.g:469:5: ( (lv_expression_10_0= ruleExpression ) )
                    	    // InternalMyDsl.g:470:6: (lv_expression_10_0= ruleExpression )
                    	    {
                    	    // InternalMyDsl.g:470:6: (lv_expression_10_0= ruleExpression )
                    	    // InternalMyDsl.g:471:7: lv_expression_10_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getVariableDeclarationAccess().getExpressionExpressionParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_expression_10_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"expression",
                    	    								lv_expression_10_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Expression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_11, grammarAccess.getVariableDeclarationAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getVariableDeclarationAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:502:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:502:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:503:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:509:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:515:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:516:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:516:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:517:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:525:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleTimeSensors"
    // InternalMyDsl.g:536:1: entryRuleTimeSensors returns [EObject current=null] : iv_ruleTimeSensors= ruleTimeSensors EOF ;
    public final EObject entryRuleTimeSensors() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeSensors = null;


        try {
            // InternalMyDsl.g:536:52: (iv_ruleTimeSensors= ruleTimeSensors EOF )
            // InternalMyDsl.g:537:2: iv_ruleTimeSensors= ruleTimeSensors EOF
            {
             newCompositeNode(grammarAccess.getTimeSensorsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeSensors=ruleTimeSensors();

            state._fsp--;

             current =iv_ruleTimeSensors; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeSensors"


    // $ANTLR start "ruleTimeSensors"
    // InternalMyDsl.g:543:1: ruleTimeSensors returns [EObject current=null] : ( () otherlv_1= 'TimeSensors' otherlv_2= '{' (otherlv_3= 'unit' ( (lv_unit_4_0= ruleEString ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleTimeSensors() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_unit_4_0 = null;

        EObject lv_newvariable_7_0 = null;

        EObject lv_newvariable_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:549:2: ( ( () otherlv_1= 'TimeSensors' otherlv_2= '{' (otherlv_3= 'unit' ( (lv_unit_4_0= ruleEString ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalMyDsl.g:550:2: ( () otherlv_1= 'TimeSensors' otherlv_2= '{' (otherlv_3= 'unit' ( (lv_unit_4_0= ruleEString ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalMyDsl.g:550:2: ( () otherlv_1= 'TimeSensors' otherlv_2= '{' (otherlv_3= 'unit' ( (lv_unit_4_0= ruleEString ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalMyDsl.g:551:3: () otherlv_1= 'TimeSensors' otherlv_2= '{' (otherlv_3= 'unit' ( (lv_unit_4_0= ruleEString ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalMyDsl.g:551:3: ()
            // InternalMyDsl.g:552:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTimeSensorsAccess().getTimeSensorsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeSensorsAccess().getTimeSensorsKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getTimeSensorsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:566:3: (otherlv_3= 'unit' ( (lv_unit_4_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:567:4: otherlv_3= 'unit' ( (lv_unit_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getTimeSensorsAccess().getUnitKeyword_3_0());
                    			
                    // InternalMyDsl.g:571:4: ( (lv_unit_4_0= ruleEString ) )
                    // InternalMyDsl.g:572:5: (lv_unit_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:572:5: (lv_unit_4_0= ruleEString )
                    // InternalMyDsl.g:573:6: lv_unit_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTimeSensorsAccess().getUnitEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_unit_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTimeSensorsRule());
                    						}
                    						set(
                    							current,
                    							"unit",
                    							lv_unit_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:591:3: (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==14) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:592:4: otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getTimeSensorsAccess().getNewvariableKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getTimeSensorsAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyDsl.g:600:4: ( (lv_newvariable_7_0= ruleVariableDeclaration ) )
                    // InternalMyDsl.g:601:5: (lv_newvariable_7_0= ruleVariableDeclaration )
                    {
                    // InternalMyDsl.g:601:5: (lv_newvariable_7_0= ruleVariableDeclaration )
                    // InternalMyDsl.g:602:6: lv_newvariable_7_0= ruleVariableDeclaration
                    {

                    						newCompositeNode(grammarAccess.getTimeSensorsAccess().getNewvariableVariableDeclarationParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_newvariable_7_0=ruleVariableDeclaration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTimeSensorsRule());
                    						}
                    						add(
                    							current,
                    							"newvariable",
                    							lv_newvariable_7_0,
                    							"org.xtext.example.mydsl.MyDsl.VariableDeclaration");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:619:4: (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==15) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalMyDsl.g:620:5: otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getTimeSensorsAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:624:5: ( (lv_newvariable_9_0= ruleVariableDeclaration ) )
                    	    // InternalMyDsl.g:625:6: (lv_newvariable_9_0= ruleVariableDeclaration )
                    	    {
                    	    // InternalMyDsl.g:625:6: (lv_newvariable_9_0= ruleVariableDeclaration )
                    	    // InternalMyDsl.g:626:7: lv_newvariable_9_0= ruleVariableDeclaration
                    	    {

                    	    							newCompositeNode(grammarAccess.getTimeSensorsAccess().getNewvariableVariableDeclarationParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_newvariable_9_0=ruleVariableDeclaration();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTimeSensorsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"newvariable",
                    	    								lv_newvariable_9_0,
                    	    								"org.xtext.example.mydsl.MyDsl.VariableDeclaration");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_10, grammarAccess.getTimeSensorsAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getTimeSensorsAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeSensors"


    // $ANTLR start "entryRuleBooleanExpr"
    // InternalMyDsl.g:657:1: entryRuleBooleanExpr returns [EObject current=null] : iv_ruleBooleanExpr= ruleBooleanExpr EOF ;
    public final EObject entryRuleBooleanExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpr = null;


        try {
            // InternalMyDsl.g:657:52: (iv_ruleBooleanExpr= ruleBooleanExpr EOF )
            // InternalMyDsl.g:658:2: iv_ruleBooleanExpr= ruleBooleanExpr EOF
            {
             newCompositeNode(grammarAccess.getBooleanExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExpr=ruleBooleanExpr();

            state._fsp--;

             current =iv_ruleBooleanExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanExpr"


    // $ANTLR start "ruleBooleanExpr"
    // InternalMyDsl.g:664:1: ruleBooleanExpr returns [EObject current=null] : ( () otherlv_1= 'BooleanExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleBooleanOperator ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? (otherlv_11= 'right' ( (lv_right_12_0= ruleExpression ) ) )? (otherlv_13= 'left' ( (lv_left_14_0= ruleExpression ) ) )? otherlv_15= '}' ) ;
    public final EObject ruleBooleanExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Enumerator lv_operator_4_0 = null;

        EObject lv_newvariable_7_0 = null;

        EObject lv_newvariable_9_0 = null;

        EObject lv_right_12_0 = null;

        EObject lv_left_14_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:670:2: ( ( () otherlv_1= 'BooleanExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleBooleanOperator ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? (otherlv_11= 'right' ( (lv_right_12_0= ruleExpression ) ) )? (otherlv_13= 'left' ( (lv_left_14_0= ruleExpression ) ) )? otherlv_15= '}' ) )
            // InternalMyDsl.g:671:2: ( () otherlv_1= 'BooleanExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleBooleanOperator ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? (otherlv_11= 'right' ( (lv_right_12_0= ruleExpression ) ) )? (otherlv_13= 'left' ( (lv_left_14_0= ruleExpression ) ) )? otherlv_15= '}' )
            {
            // InternalMyDsl.g:671:2: ( () otherlv_1= 'BooleanExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleBooleanOperator ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? (otherlv_11= 'right' ( (lv_right_12_0= ruleExpression ) ) )? (otherlv_13= 'left' ( (lv_left_14_0= ruleExpression ) ) )? otherlv_15= '}' )
            // InternalMyDsl.g:672:3: () otherlv_1= 'BooleanExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleBooleanOperator ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? (otherlv_11= 'right' ( (lv_right_12_0= ruleExpression ) ) )? (otherlv_13= 'left' ( (lv_left_14_0= ruleExpression ) ) )? otherlv_15= '}'
            {
            // InternalMyDsl.g:672:3: ()
            // InternalMyDsl.g:673:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanExprAccess().getBooleanExprAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBooleanExprAccess().getBooleanExprKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getBooleanExprAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:687:3: (otherlv_3= 'operator' ( (lv_operator_4_0= ruleBooleanOperator ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==13) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:688:4: otherlv_3= 'operator' ( (lv_operator_4_0= ruleBooleanOperator ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_19); 

                    				newLeafNode(otherlv_3, grammarAccess.getBooleanExprAccess().getOperatorKeyword_3_0());
                    			
                    // InternalMyDsl.g:692:4: ( (lv_operator_4_0= ruleBooleanOperator ) )
                    // InternalMyDsl.g:693:5: (lv_operator_4_0= ruleBooleanOperator )
                    {
                    // InternalMyDsl.g:693:5: (lv_operator_4_0= ruleBooleanOperator )
                    // InternalMyDsl.g:694:6: lv_operator_4_0= ruleBooleanOperator
                    {

                    						newCompositeNode(grammarAccess.getBooleanExprAccess().getOperatorBooleanOperatorEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_operator_4_0=ruleBooleanOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBooleanExprRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_4_0,
                    							"org.xtext.example.mydsl.MyDsl.BooleanOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:712:3: (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==14) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:713:4: otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getBooleanExprAccess().getNewvariableKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getBooleanExprAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyDsl.g:721:4: ( (lv_newvariable_7_0= ruleVariableDeclaration ) )
                    // InternalMyDsl.g:722:5: (lv_newvariable_7_0= ruleVariableDeclaration )
                    {
                    // InternalMyDsl.g:722:5: (lv_newvariable_7_0= ruleVariableDeclaration )
                    // InternalMyDsl.g:723:6: lv_newvariable_7_0= ruleVariableDeclaration
                    {

                    						newCompositeNode(grammarAccess.getBooleanExprAccess().getNewvariableVariableDeclarationParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_newvariable_7_0=ruleVariableDeclaration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBooleanExprRule());
                    						}
                    						add(
                    							current,
                    							"newvariable",
                    							lv_newvariable_7_0,
                    							"org.xtext.example.mydsl.MyDsl.VariableDeclaration");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:740:4: (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==15) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalMyDsl.g:741:5: otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getBooleanExprAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:745:5: ( (lv_newvariable_9_0= ruleVariableDeclaration ) )
                    	    // InternalMyDsl.g:746:6: (lv_newvariable_9_0= ruleVariableDeclaration )
                    	    {
                    	    // InternalMyDsl.g:746:6: (lv_newvariable_9_0= ruleVariableDeclaration )
                    	    // InternalMyDsl.g:747:7: lv_newvariable_9_0= ruleVariableDeclaration
                    	    {

                    	    							newCompositeNode(grammarAccess.getBooleanExprAccess().getNewvariableVariableDeclarationParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_newvariable_9_0=ruleVariableDeclaration();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBooleanExprRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"newvariable",
                    	    								lv_newvariable_9_0,
                    	    								"org.xtext.example.mydsl.MyDsl.VariableDeclaration");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getBooleanExprAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:770:3: (otherlv_11= 'right' ( (lv_right_12_0= ruleExpression ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==18) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:771:4: otherlv_11= 'right' ( (lv_right_12_0= ruleExpression ) )
                    {
                    otherlv_11=(Token)match(input,18,FOLLOW_16); 

                    				newLeafNode(otherlv_11, grammarAccess.getBooleanExprAccess().getRightKeyword_5_0());
                    			
                    // InternalMyDsl.g:775:4: ( (lv_right_12_0= ruleExpression ) )
                    // InternalMyDsl.g:776:5: (lv_right_12_0= ruleExpression )
                    {
                    // InternalMyDsl.g:776:5: (lv_right_12_0= ruleExpression )
                    // InternalMyDsl.g:777:6: lv_right_12_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getBooleanExprAccess().getRightExpressionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_right_12_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBooleanExprRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_12_0,
                    							"org.xtext.example.mydsl.MyDsl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:795:3: (otherlv_13= 'left' ( (lv_left_14_0= ruleExpression ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==17) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:796:4: otherlv_13= 'left' ( (lv_left_14_0= ruleExpression ) )
                    {
                    otherlv_13=(Token)match(input,17,FOLLOW_16); 

                    				newLeafNode(otherlv_13, grammarAccess.getBooleanExprAccess().getLeftKeyword_6_0());
                    			
                    // InternalMyDsl.g:800:4: ( (lv_left_14_0= ruleExpression ) )
                    // InternalMyDsl.g:801:5: (lv_left_14_0= ruleExpression )
                    {
                    // InternalMyDsl.g:801:5: (lv_left_14_0= ruleExpression )
                    // InternalMyDsl.g:802:6: lv_left_14_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getBooleanExprAccess().getLeftExpressionParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_left_14_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBooleanExprRule());
                    						}
                    						set(
                    							current,
                    							"left",
                    							lv_left_14_0,
                    							"org.xtext.example.mydsl.MyDsl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getBooleanExprAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanExpr"


    // $ANTLR start "entryRuleIntExpression"
    // InternalMyDsl.g:828:1: entryRuleIntExpression returns [EObject current=null] : iv_ruleIntExpression= ruleIntExpression EOF ;
    public final EObject entryRuleIntExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntExpression = null;


        try {
            // InternalMyDsl.g:828:54: (iv_ruleIntExpression= ruleIntExpression EOF )
            // InternalMyDsl.g:829:2: iv_ruleIntExpression= ruleIntExpression EOF
            {
             newCompositeNode(grammarAccess.getIntExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntExpression=ruleIntExpression();

            state._fsp--;

             current =iv_ruleIntExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntExpression"


    // $ANTLR start "ruleIntExpression"
    // InternalMyDsl.g:835:1: ruleIntExpression returns [EObject current=null] : ( () otherlv_1= 'IntExpression' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleIntExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;

        EObject lv_newvariable_7_0 = null;

        EObject lv_newvariable_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:841:2: ( ( () otherlv_1= 'IntExpression' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalMyDsl.g:842:2: ( () otherlv_1= 'IntExpression' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalMyDsl.g:842:2: ( () otherlv_1= 'IntExpression' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalMyDsl.g:843:3: () otherlv_1= 'IntExpression' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalMyDsl.g:843:3: ()
            // InternalMyDsl.g:844:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntExpressionAccess().getIntExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getIntExpressionAccess().getIntExpressionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getIntExpressionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:858:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:859:4: otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_22); 

                    				newLeafNode(otherlv_3, grammarAccess.getIntExpressionAccess().getValueKeyword_3_0());
                    			
                    // InternalMyDsl.g:863:4: ( (lv_value_4_0= ruleEInt ) )
                    // InternalMyDsl.g:864:5: (lv_value_4_0= ruleEInt )
                    {
                    // InternalMyDsl.g:864:5: (lv_value_4_0= ruleEInt )
                    // InternalMyDsl.g:865:6: lv_value_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getIntExpressionAccess().getValueEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_value_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntExpressionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:883:3: (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==14) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:884:4: otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getIntExpressionAccess().getNewvariableKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getIntExpressionAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyDsl.g:892:4: ( (lv_newvariable_7_0= ruleVariableDeclaration ) )
                    // InternalMyDsl.g:893:5: (lv_newvariable_7_0= ruleVariableDeclaration )
                    {
                    // InternalMyDsl.g:893:5: (lv_newvariable_7_0= ruleVariableDeclaration )
                    // InternalMyDsl.g:894:6: lv_newvariable_7_0= ruleVariableDeclaration
                    {

                    						newCompositeNode(grammarAccess.getIntExpressionAccess().getNewvariableVariableDeclarationParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_newvariable_7_0=ruleVariableDeclaration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntExpressionRule());
                    						}
                    						add(
                    							current,
                    							"newvariable",
                    							lv_newvariable_7_0,
                    							"org.xtext.example.mydsl.MyDsl.VariableDeclaration");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:911:4: (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==15) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalMyDsl.g:912:5: otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getIntExpressionAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:916:5: ( (lv_newvariable_9_0= ruleVariableDeclaration ) )
                    	    // InternalMyDsl.g:917:6: (lv_newvariable_9_0= ruleVariableDeclaration )
                    	    {
                    	    // InternalMyDsl.g:917:6: (lv_newvariable_9_0= ruleVariableDeclaration )
                    	    // InternalMyDsl.g:918:7: lv_newvariable_9_0= ruleVariableDeclaration
                    	    {

                    	    							newCompositeNode(grammarAccess.getIntExpressionAccess().getNewvariableVariableDeclarationParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_newvariable_9_0=ruleVariableDeclaration();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIntExpressionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"newvariable",
                    	    								lv_newvariable_9_0,
                    	    								"org.xtext.example.mydsl.MyDsl.VariableDeclaration");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_10, grammarAccess.getIntExpressionAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getIntExpressionAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntExpression"


    // $ANTLR start "entryRuleBoolean"
    // InternalMyDsl.g:949:1: entryRuleBoolean returns [EObject current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final EObject entryRuleBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolean = null;


        try {
            // InternalMyDsl.g:949:48: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalMyDsl.g:950:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalMyDsl.g:956:1: ruleBoolean returns [EObject current=null] : ( () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'Boolean' otherlv_3= '{' (otherlv_4= 'newvariable' otherlv_5= '{' ( (lv_newvariable_6_0= ruleVariableDeclaration ) ) (otherlv_7= ',' ( (lv_newvariable_8_0= ruleVariableDeclaration ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleBoolean() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_newvariable_6_0 = null;

        EObject lv_newvariable_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:962:2: ( ( () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'Boolean' otherlv_3= '{' (otherlv_4= 'newvariable' otherlv_5= '{' ( (lv_newvariable_6_0= ruleVariableDeclaration ) ) (otherlv_7= ',' ( (lv_newvariable_8_0= ruleVariableDeclaration ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalMyDsl.g:963:2: ( () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'Boolean' otherlv_3= '{' (otherlv_4= 'newvariable' otherlv_5= '{' ( (lv_newvariable_6_0= ruleVariableDeclaration ) ) (otherlv_7= ',' ( (lv_newvariable_8_0= ruleVariableDeclaration ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalMyDsl.g:963:2: ( () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'Boolean' otherlv_3= '{' (otherlv_4= 'newvariable' otherlv_5= '{' ( (lv_newvariable_6_0= ruleVariableDeclaration ) ) (otherlv_7= ',' ( (lv_newvariable_8_0= ruleVariableDeclaration ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalMyDsl.g:964:3: () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'Boolean' otherlv_3= '{' (otherlv_4= 'newvariable' otherlv_5= '{' ( (lv_newvariable_6_0= ruleVariableDeclaration ) ) (otherlv_7= ',' ( (lv_newvariable_8_0= ruleVariableDeclaration ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalMyDsl.g:964:3: ()
            // InternalMyDsl.g:965:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanAccess().getBooleanAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:971:3: ( (lv_value_1_0= 'value' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==26) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:972:4: (lv_value_1_0= 'value' )
                    {
                    // InternalMyDsl.g:972:4: (lv_value_1_0= 'value' )
                    // InternalMyDsl.g:973:5: lv_value_1_0= 'value'
                    {
                    lv_value_1_0=(Token)match(input,26,FOLLOW_23); 

                    					newLeafNode(lv_value_1_0, grammarAccess.getBooleanAccess().getValueValueKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_1_0 != null, "value");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getBooleanAccess().getBooleanKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getBooleanAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:993:3: (otherlv_4= 'newvariable' otherlv_5= '{' ( (lv_newvariable_6_0= ruleVariableDeclaration ) ) (otherlv_7= ',' ( (lv_newvariable_8_0= ruleVariableDeclaration ) ) )* otherlv_9= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==14) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:994:4: otherlv_4= 'newvariable' otherlv_5= '{' ( (lv_newvariable_6_0= ruleVariableDeclaration ) ) (otherlv_7= ',' ( (lv_newvariable_8_0= ruleVariableDeclaration ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getBooleanAccess().getNewvariableKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getBooleanAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyDsl.g:1002:4: ( (lv_newvariable_6_0= ruleVariableDeclaration ) )
                    // InternalMyDsl.g:1003:5: (lv_newvariable_6_0= ruleVariableDeclaration )
                    {
                    // InternalMyDsl.g:1003:5: (lv_newvariable_6_0= ruleVariableDeclaration )
                    // InternalMyDsl.g:1004:6: lv_newvariable_6_0= ruleVariableDeclaration
                    {

                    						newCompositeNode(grammarAccess.getBooleanAccess().getNewvariableVariableDeclarationParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_newvariable_6_0=ruleVariableDeclaration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBooleanRule());
                    						}
                    						add(
                    							current,
                    							"newvariable",
                    							lv_newvariable_6_0,
                    							"org.xtext.example.mydsl.MyDsl.VariableDeclaration");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1021:4: (otherlv_7= ',' ( (lv_newvariable_8_0= ruleVariableDeclaration ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==15) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalMyDsl.g:1022:5: otherlv_7= ',' ( (lv_newvariable_8_0= ruleVariableDeclaration ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_7); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getBooleanAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:1026:5: ( (lv_newvariable_8_0= ruleVariableDeclaration ) )
                    	    // InternalMyDsl.g:1027:6: (lv_newvariable_8_0= ruleVariableDeclaration )
                    	    {
                    	    // InternalMyDsl.g:1027:6: (lv_newvariable_8_0= ruleVariableDeclaration )
                    	    // InternalMyDsl.g:1028:7: lv_newvariable_8_0= ruleVariableDeclaration
                    	    {

                    	    							newCompositeNode(grammarAccess.getBooleanAccess().getNewvariableVariableDeclarationParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_newvariable_8_0=ruleVariableDeclaration();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBooleanRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"newvariable",
                    	    								lv_newvariable_8_0,
                    	    								"org.xtext.example.mydsl.MyDsl.VariableDeclaration");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getBooleanAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getBooleanAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleDistanceSensor"
    // InternalMyDsl.g:1059:1: entryRuleDistanceSensor returns [EObject current=null] : iv_ruleDistanceSensor= ruleDistanceSensor EOF ;
    public final EObject entryRuleDistanceSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistanceSensor = null;


        try {
            // InternalMyDsl.g:1059:55: (iv_ruleDistanceSensor= ruleDistanceSensor EOF )
            // InternalMyDsl.g:1060:2: iv_ruleDistanceSensor= ruleDistanceSensor EOF
            {
             newCompositeNode(grammarAccess.getDistanceSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDistanceSensor=ruleDistanceSensor();

            state._fsp--;

             current =iv_ruleDistanceSensor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDistanceSensor"


    // $ANTLR start "ruleDistanceSensor"
    // InternalMyDsl.g:1066:1: ruleDistanceSensor returns [EObject current=null] : ( () otherlv_1= 'DistanceSensor' otherlv_2= '{' (otherlv_3= 'unit' ( (lv_unit_4_0= ruleEString ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleDistanceSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_unit_4_0 = null;

        EObject lv_newvariable_7_0 = null;

        EObject lv_newvariable_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1072:2: ( ( () otherlv_1= 'DistanceSensor' otherlv_2= '{' (otherlv_3= 'unit' ( (lv_unit_4_0= ruleEString ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalMyDsl.g:1073:2: ( () otherlv_1= 'DistanceSensor' otherlv_2= '{' (otherlv_3= 'unit' ( (lv_unit_4_0= ruleEString ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalMyDsl.g:1073:2: ( () otherlv_1= 'DistanceSensor' otherlv_2= '{' (otherlv_3= 'unit' ( (lv_unit_4_0= ruleEString ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalMyDsl.g:1074:3: () otherlv_1= 'DistanceSensor' otherlv_2= '{' (otherlv_3= 'unit' ( (lv_unit_4_0= ruleEString ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalMyDsl.g:1074:3: ()
            // InternalMyDsl.g:1075:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDistanceSensorAccess().getDistanceSensorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDistanceSensorAccess().getDistanceSensorKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getDistanceSensorAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1089:3: (otherlv_3= 'unit' ( (lv_unit_4_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==23) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:1090:4: otherlv_3= 'unit' ( (lv_unit_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getDistanceSensorAccess().getUnitKeyword_3_0());
                    			
                    // InternalMyDsl.g:1094:4: ( (lv_unit_4_0= ruleEString ) )
                    // InternalMyDsl.g:1095:5: (lv_unit_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:1095:5: (lv_unit_4_0= ruleEString )
                    // InternalMyDsl.g:1096:6: lv_unit_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDistanceSensorAccess().getUnitEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_unit_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDistanceSensorRule());
                    						}
                    						set(
                    							current,
                    							"unit",
                    							lv_unit_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1114:3: (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==14) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:1115:4: otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getDistanceSensorAccess().getNewvariableKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getDistanceSensorAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyDsl.g:1123:4: ( (lv_newvariable_7_0= ruleVariableDeclaration ) )
                    // InternalMyDsl.g:1124:5: (lv_newvariable_7_0= ruleVariableDeclaration )
                    {
                    // InternalMyDsl.g:1124:5: (lv_newvariable_7_0= ruleVariableDeclaration )
                    // InternalMyDsl.g:1125:6: lv_newvariable_7_0= ruleVariableDeclaration
                    {

                    						newCompositeNode(grammarAccess.getDistanceSensorAccess().getNewvariableVariableDeclarationParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_newvariable_7_0=ruleVariableDeclaration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDistanceSensorRule());
                    						}
                    						add(
                    							current,
                    							"newvariable",
                    							lv_newvariable_7_0,
                    							"org.xtext.example.mydsl.MyDsl.VariableDeclaration");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1142:4: (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==15) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalMyDsl.g:1143:5: otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getDistanceSensorAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:1147:5: ( (lv_newvariable_9_0= ruleVariableDeclaration ) )
                    	    // InternalMyDsl.g:1148:6: (lv_newvariable_9_0= ruleVariableDeclaration )
                    	    {
                    	    // InternalMyDsl.g:1148:6: (lv_newvariable_9_0= ruleVariableDeclaration )
                    	    // InternalMyDsl.g:1149:7: lv_newvariable_9_0= ruleVariableDeclaration
                    	    {

                    	    							newCompositeNode(grammarAccess.getDistanceSensorAccess().getNewvariableVariableDeclarationParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_newvariable_9_0=ruleVariableDeclaration();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDistanceSensorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"newvariable",
                    	    								lv_newvariable_9_0,
                    	    								"org.xtext.example.mydsl.MyDsl.VariableDeclaration");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_10, grammarAccess.getDistanceSensorAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getDistanceSensorAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDistanceSensor"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:1180:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMyDsl.g:1180:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMyDsl.g:1181:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:1187:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1193:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMyDsl.g:1194:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMyDsl.g:1194:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMyDsl.g:1195:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMyDsl.g:1195:3: (kw= '-' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==29) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:1196:4: kw= '-'
                    {
                    kw=(Token)match(input,29,FOLLOW_24); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleOperator"
    // InternalMyDsl.g:1213:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'ADD' ) | (enumLiteral_1= 'SUB' ) | (enumLiteral_2= 'MUL' ) | (enumLiteral_3= 'DIV' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1219:2: ( ( (enumLiteral_0= 'ADD' ) | (enumLiteral_1= 'SUB' ) | (enumLiteral_2= 'MUL' ) | (enumLiteral_3= 'DIV' ) ) )
            // InternalMyDsl.g:1220:2: ( (enumLiteral_0= 'ADD' ) | (enumLiteral_1= 'SUB' ) | (enumLiteral_2= 'MUL' ) | (enumLiteral_3= 'DIV' ) )
            {
            // InternalMyDsl.g:1220:2: ( (enumLiteral_0= 'ADD' ) | (enumLiteral_1= 'SUB' ) | (enumLiteral_2= 'MUL' ) | (enumLiteral_3= 'DIV' ) )
            int alt30=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt30=1;
                }
                break;
            case 31:
                {
                alt30=2;
                }
                break;
            case 32:
                {
                alt30=3;
                }
                break;
            case 33:
                {
                alt30=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:1221:3: (enumLiteral_0= 'ADD' )
                    {
                    // InternalMyDsl.g:1221:3: (enumLiteral_0= 'ADD' )
                    // InternalMyDsl.g:1222:4: enumLiteral_0= 'ADD'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getADDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1229:3: (enumLiteral_1= 'SUB' )
                    {
                    // InternalMyDsl.g:1229:3: (enumLiteral_1= 'SUB' )
                    // InternalMyDsl.g:1230:4: enumLiteral_1= 'SUB'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getSUBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getSUBEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1237:3: (enumLiteral_2= 'MUL' )
                    {
                    // InternalMyDsl.g:1237:3: (enumLiteral_2= 'MUL' )
                    // InternalMyDsl.g:1238:4: enumLiteral_2= 'MUL'
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getMULEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperatorAccess().getMULEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1245:3: (enumLiteral_3= 'DIV' )
                    {
                    // InternalMyDsl.g:1245:3: (enumLiteral_3= 'DIV' )
                    // InternalMyDsl.g:1246:4: enumLiteral_3= 'DIV'
                    {
                    enumLiteral_3=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getDIVEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOperatorAccess().getDIVEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "ruleBooleanOperator"
    // InternalMyDsl.g:1256:1: ruleBooleanOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'NOT' ) | (enumLiteral_3= 'EQUALS' ) | (enumLiteral_4= 'LESS' ) | (enumLiteral_5= 'GREATER' ) ) ;
    public final Enumerator ruleBooleanOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1262:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'NOT' ) | (enumLiteral_3= 'EQUALS' ) | (enumLiteral_4= 'LESS' ) | (enumLiteral_5= 'GREATER' ) ) )
            // InternalMyDsl.g:1263:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'NOT' ) | (enumLiteral_3= 'EQUALS' ) | (enumLiteral_4= 'LESS' ) | (enumLiteral_5= 'GREATER' ) )
            {
            // InternalMyDsl.g:1263:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'NOT' ) | (enumLiteral_3= 'EQUALS' ) | (enumLiteral_4= 'LESS' ) | (enumLiteral_5= 'GREATER' ) )
            int alt31=6;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt31=1;
                }
                break;
            case 35:
                {
                alt31=2;
                }
                break;
            case 36:
                {
                alt31=3;
                }
                break;
            case 37:
                {
                alt31=4;
                }
                break;
            case 38:
                {
                alt31=5;
                }
                break;
            case 39:
                {
                alt31=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:1264:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalMyDsl.g:1264:3: (enumLiteral_0= 'AND' )
                    // InternalMyDsl.g:1265:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getBooleanOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBooleanOperatorAccess().getANDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1272:3: (enumLiteral_1= 'OR' )
                    {
                    // InternalMyDsl.g:1272:3: (enumLiteral_1= 'OR' )
                    // InternalMyDsl.g:1273:4: enumLiteral_1= 'OR'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getBooleanOperatorAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBooleanOperatorAccess().getOREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1280:3: (enumLiteral_2= 'NOT' )
                    {
                    // InternalMyDsl.g:1280:3: (enumLiteral_2= 'NOT' )
                    // InternalMyDsl.g:1281:4: enumLiteral_2= 'NOT'
                    {
                    enumLiteral_2=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getBooleanOperatorAccess().getNOTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBooleanOperatorAccess().getNOTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1288:3: (enumLiteral_3= 'EQUALS' )
                    {
                    // InternalMyDsl.g:1288:3: (enumLiteral_3= 'EQUALS' )
                    // InternalMyDsl.g:1289:4: enumLiteral_3= 'EQUALS'
                    {
                    enumLiteral_3=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getBooleanOperatorAccess().getEQUALSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBooleanOperatorAccess().getEQUALSEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1296:3: (enumLiteral_4= 'LESS' )
                    {
                    // InternalMyDsl.g:1296:3: (enumLiteral_4= 'LESS' )
                    // InternalMyDsl.g:1297:4: enumLiteral_4= 'LESS'
                    {
                    enumLiteral_4=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getBooleanOperatorAccess().getLESSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getBooleanOperatorAccess().getLESSEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1304:3: (enumLiteral_5= 'GREATER' )
                    {
                    // InternalMyDsl.g:1304:3: (enumLiteral_5= 'GREATER' )
                    // InternalMyDsl.g:1305:4: enumLiteral_5= 'GREATER'
                    {
                    enumLiteral_5=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getBooleanOperatorAccess().getGREATEREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getBooleanOperatorAccess().getGREATEREnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanOperator"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000076000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000074000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000012400800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000310000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000001F400800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000814000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000FC00000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004014000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L});

}