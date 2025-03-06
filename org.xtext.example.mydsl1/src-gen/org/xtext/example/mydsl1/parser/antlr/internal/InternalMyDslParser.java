package org.xtext.example.mydsl1.parser.antlr.internal;

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
import org.xtext.example.mydsl1.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Program'", "'{'", "'instruction'", "','", "'}'", "'Movement'", "'direction'", "'Distance'", "'unit'", "'Rotation'", "'angleUnit'", "'Loop'", "'booleanexpr'", "'Condition'", "'then'", "'else'", "'VariableAssignement'", "'variabledeclaration'", "'expression'", "'VariableDeclaration'", "'type'", "'FunctionDeclaration'", "'returntype'", "'FunctionCall'", "'functiondeclaration'", "'parameter'", "'-'", "'BooleanExpr'", "'operator'", "'newvariable'", "'right'", "'left'", "'TimeSensors'", "'ArithmeticExpr'", "'IntExpression'", "'value'", "'Boolean'", "'DistanceSensor'", "'ReturnType'", "'returnType'", "'Parameter'", "'Front'", "'Back'", "'Right'", "'Left'", "'Degre'", "'Radian'", "'AND'", "'OR'", "'NOT'", "'EQUALS'", "'LESS'", "'GREATER'", "'ADD'", "'SUB'", "'MUL'", "'DIV'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
        	return "Program";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalMyDsl.g:65:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalMyDsl.g:65:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalMyDsl.g:66:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalMyDsl.g:72:1: ruleProgram returns [EObject current=null] : ( () otherlv_1= 'Program' otherlv_2= '{' (otherlv_3= 'instruction' otherlv_4= '{' ( (lv_instruction_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instruction_7_0= ruleInstruction ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_instruction_5_0 = null;

        EObject lv_instruction_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( ( () otherlv_1= 'Program' otherlv_2= '{' (otherlv_3= 'instruction' otherlv_4= '{' ( (lv_instruction_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instruction_7_0= ruleInstruction ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalMyDsl.g:79:2: ( () otherlv_1= 'Program' otherlv_2= '{' (otherlv_3= 'instruction' otherlv_4= '{' ( (lv_instruction_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instruction_7_0= ruleInstruction ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalMyDsl.g:79:2: ( () otherlv_1= 'Program' otherlv_2= '{' (otherlv_3= 'instruction' otherlv_4= '{' ( (lv_instruction_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instruction_7_0= ruleInstruction ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalMyDsl.g:80:3: () otherlv_1= 'Program' otherlv_2= '{' (otherlv_3= 'instruction' otherlv_4= '{' ( (lv_instruction_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instruction_7_0= ruleInstruction ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalMyDsl.g:80:3: ()
            // InternalMyDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProgramAccess().getProgramAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getProgramAccess().getProgramKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:95:3: (otherlv_3= 'instruction' otherlv_4= '{' ( (lv_instruction_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instruction_7_0= ruleInstruction ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:96:4: otherlv_3= 'instruction' otherlv_4= '{' ( (lv_instruction_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instruction_7_0= ruleInstruction ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getProgramAccess().getInstructionKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalMyDsl.g:104:4: ( (lv_instruction_5_0= ruleInstruction ) )
                    // InternalMyDsl.g:105:5: (lv_instruction_5_0= ruleInstruction )
                    {
                    // InternalMyDsl.g:105:5: (lv_instruction_5_0= ruleInstruction )
                    // InternalMyDsl.g:106:6: lv_instruction_5_0= ruleInstruction
                    {

                    						newCompositeNode(grammarAccess.getProgramAccess().getInstructionInstructionParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_instruction_5_0=ruleInstruction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProgramRule());
                    						}
                    						add(
                    							current,
                    							"instruction",
                    							lv_instruction_5_0,
                    							"org.xtext.example.mydsl1.MyDsl.Instruction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:123:4: (otherlv_6= ',' ( (lv_instruction_7_0= ruleInstruction ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalMyDsl.g:124:5: otherlv_6= ',' ( (lv_instruction_7_0= ruleInstruction ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getProgramAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalMyDsl.g:128:5: ( (lv_instruction_7_0= ruleInstruction ) )
                    	    // InternalMyDsl.g:129:6: (lv_instruction_7_0= ruleInstruction )
                    	    {
                    	    // InternalMyDsl.g:129:6: (lv_instruction_7_0= ruleInstruction )
                    	    // InternalMyDsl.g:130:7: lv_instruction_7_0= ruleInstruction
                    	    {

                    	    							newCompositeNode(grammarAccess.getProgramAccess().getInstructionInstructionParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_instruction_7_0=ruleInstruction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProgramRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"instruction",
                    	    								lv_instruction_7_0,
                    	    								"org.xtext.example.mydsl1.MyDsl.Instruction");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleInstruction"
    // InternalMyDsl.g:161:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalMyDsl.g:161:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalMyDsl.g:162:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
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
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalMyDsl.g:168:1: ruleInstruction returns [EObject current=null] : (this_Movement_0= ruleMovement | this_Rotation_1= ruleRotation | this_Loop_2= ruleLoop | this_Condition_3= ruleCondition | this_VariableAssignement_4= ruleVariableAssignement | this_VariableDeclaration_5= ruleVariableDeclaration | this_FunctionDeclaration_6= ruleFunctionDeclaration | this_FunctionCall_7= ruleFunctionCall ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_Movement_0 = null;

        EObject this_Rotation_1 = null;

        EObject this_Loop_2 = null;

        EObject this_Condition_3 = null;

        EObject this_VariableAssignement_4 = null;

        EObject this_VariableDeclaration_5 = null;

        EObject this_FunctionDeclaration_6 = null;

        EObject this_FunctionCall_7 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:174:2: ( (this_Movement_0= ruleMovement | this_Rotation_1= ruleRotation | this_Loop_2= ruleLoop | this_Condition_3= ruleCondition | this_VariableAssignement_4= ruleVariableAssignement | this_VariableDeclaration_5= ruleVariableDeclaration | this_FunctionDeclaration_6= ruleFunctionDeclaration | this_FunctionCall_7= ruleFunctionCall ) )
            // InternalMyDsl.g:175:2: (this_Movement_0= ruleMovement | this_Rotation_1= ruleRotation | this_Loop_2= ruleLoop | this_Condition_3= ruleCondition | this_VariableAssignement_4= ruleVariableAssignement | this_VariableDeclaration_5= ruleVariableDeclaration | this_FunctionDeclaration_6= ruleFunctionDeclaration | this_FunctionCall_7= ruleFunctionCall )
            {
            // InternalMyDsl.g:175:2: (this_Movement_0= ruleMovement | this_Rotation_1= ruleRotation | this_Loop_2= ruleLoop | this_Condition_3= ruleCondition | this_VariableAssignement_4= ruleVariableAssignement | this_VariableDeclaration_5= ruleVariableDeclaration | this_FunctionDeclaration_6= ruleFunctionDeclaration | this_FunctionCall_7= ruleFunctionCall )
            int alt3=8;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 20:
                {
                alt3=2;
                }
                break;
            case 22:
                {
                alt3=3;
                }
                break;
            case 24:
                {
                alt3=4;
                }
                break;
            case 27:
                {
                alt3=5;
                }
                break;
            case 30:
                {
                alt3=6;
                }
                break;
            case 32:
                {
                alt3=7;
                }
                break;
            case 34:
                {
                alt3=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:176:3: this_Movement_0= ruleMovement
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getMovementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Movement_0=ruleMovement();

                    state._fsp--;


                    			current = this_Movement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:185:3: this_Rotation_1= ruleRotation
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getRotationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rotation_1=ruleRotation();

                    state._fsp--;


                    			current = this_Rotation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:194:3: this_Loop_2= ruleLoop
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getLoopParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Loop_2=ruleLoop();

                    state._fsp--;


                    			current = this_Loop_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:203:3: this_Condition_3= ruleCondition
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getConditionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Condition_3=ruleCondition();

                    state._fsp--;


                    			current = this_Condition_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:212:3: this_VariableAssignement_4= ruleVariableAssignement
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getVariableAssignementParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableAssignement_4=ruleVariableAssignement();

                    state._fsp--;


                    			current = this_VariableAssignement_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:221:3: this_VariableDeclaration_5= ruleVariableDeclaration
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getVariableDeclarationParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableDeclaration_5=ruleVariableDeclaration();

                    state._fsp--;


                    			current = this_VariableDeclaration_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:230:3: this_FunctionDeclaration_6= ruleFunctionDeclaration
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getFunctionDeclarationParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunctionDeclaration_6=ruleFunctionDeclaration();

                    state._fsp--;


                    			current = this_FunctionDeclaration_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:239:3: this_FunctionCall_7= ruleFunctionCall
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getFunctionCallParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunctionCall_7=ruleFunctionCall();

                    state._fsp--;


                    			current = this_FunctionCall_7;
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
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:251:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMyDsl.g:251:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyDsl.g:252:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalMyDsl.g:258:1: ruleExpression returns [EObject current=null] : (this_TimeSensors_0= ruleTimeSensors | this_ArithmeticExpr_1= ruleArithmeticExpr | this_BooleanExpr_2= ruleBooleanExpr | this_IntExpression_3= ruleIntExpression | this_Boolean_4= ruleBoolean | this_DistanceSensor_5= ruleDistanceSensor ) ;
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
            // InternalMyDsl.g:264:2: ( (this_TimeSensors_0= ruleTimeSensors | this_ArithmeticExpr_1= ruleArithmeticExpr | this_BooleanExpr_2= ruleBooleanExpr | this_IntExpression_3= ruleIntExpression | this_Boolean_4= ruleBoolean | this_DistanceSensor_5= ruleDistanceSensor ) )
            // InternalMyDsl.g:265:2: (this_TimeSensors_0= ruleTimeSensors | this_ArithmeticExpr_1= ruleArithmeticExpr | this_BooleanExpr_2= ruleBooleanExpr | this_IntExpression_3= ruleIntExpression | this_Boolean_4= ruleBoolean | this_DistanceSensor_5= ruleDistanceSensor )
            {
            // InternalMyDsl.g:265:2: (this_TimeSensors_0= ruleTimeSensors | this_ArithmeticExpr_1= ruleArithmeticExpr | this_BooleanExpr_2= ruleBooleanExpr | this_IntExpression_3= ruleIntExpression | this_Boolean_4= ruleBoolean | this_DistanceSensor_5= ruleDistanceSensor )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt4=1;
                }
                break;
            case 44:
                {
                alt4=2;
                }
                break;
            case 38:
                {
                alt4=3;
                }
                break;
            case 45:
                {
                alt4=4;
                }
                break;
            case 46:
            case 47:
                {
                alt4=5;
                }
                break;
            case 48:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:266:3: this_TimeSensors_0= ruleTimeSensors
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
                    // InternalMyDsl.g:275:3: this_ArithmeticExpr_1= ruleArithmeticExpr
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
                    // InternalMyDsl.g:284:3: this_BooleanExpr_2= ruleBooleanExpr
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
                    // InternalMyDsl.g:293:3: this_IntExpression_3= ruleIntExpression
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
                    // InternalMyDsl.g:302:3: this_Boolean_4= ruleBoolean
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
                    // InternalMyDsl.g:311:3: this_DistanceSensor_5= ruleDistanceSensor
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


    // $ANTLR start "entryRuleNumberExpr"
    // InternalMyDsl.g:323:1: entryRuleNumberExpr returns [EObject current=null] : iv_ruleNumberExpr= ruleNumberExpr EOF ;
    public final EObject entryRuleNumberExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberExpr = null;


        try {
            // InternalMyDsl.g:323:51: (iv_ruleNumberExpr= ruleNumberExpr EOF )
            // InternalMyDsl.g:324:2: iv_ruleNumberExpr= ruleNumberExpr EOF
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
    // InternalMyDsl.g:330:1: ruleNumberExpr returns [EObject current=null] : (this_TimeSensors_0= ruleTimeSensors | this_ArithmeticExpr_1= ruleArithmeticExpr | this_IntExpression_2= ruleIntExpression | this_DistanceSensor_3= ruleDistanceSensor ) ;
    public final EObject ruleNumberExpr() throws RecognitionException {
        EObject current = null;

        EObject this_TimeSensors_0 = null;

        EObject this_ArithmeticExpr_1 = null;

        EObject this_IntExpression_2 = null;

        EObject this_DistanceSensor_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:336:2: ( (this_TimeSensors_0= ruleTimeSensors | this_ArithmeticExpr_1= ruleArithmeticExpr | this_IntExpression_2= ruleIntExpression | this_DistanceSensor_3= ruleDistanceSensor ) )
            // InternalMyDsl.g:337:2: (this_TimeSensors_0= ruleTimeSensors | this_ArithmeticExpr_1= ruleArithmeticExpr | this_IntExpression_2= ruleIntExpression | this_DistanceSensor_3= ruleDistanceSensor )
            {
            // InternalMyDsl.g:337:2: (this_TimeSensors_0= ruleTimeSensors | this_ArithmeticExpr_1= ruleArithmeticExpr | this_IntExpression_2= ruleIntExpression | this_DistanceSensor_3= ruleDistanceSensor )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt5=1;
                }
                break;
            case 44:
                {
                alt5=2;
                }
                break;
            case 45:
                {
                alt5=3;
                }
                break;
            case 48:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:338:3: this_TimeSensors_0= ruleTimeSensors
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
                    // InternalMyDsl.g:347:3: this_ArithmeticExpr_1= ruleArithmeticExpr
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
                    // InternalMyDsl.g:356:3: this_IntExpression_2= ruleIntExpression
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
                    // InternalMyDsl.g:365:3: this_DistanceSensor_3= ruleDistanceSensor
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


    // $ANTLR start "entryRuleMovement"
    // InternalMyDsl.g:377:1: entryRuleMovement returns [EObject current=null] : iv_ruleMovement= ruleMovement EOF ;
    public final EObject entryRuleMovement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMovement = null;


        try {
            // InternalMyDsl.g:377:49: (iv_ruleMovement= ruleMovement EOF )
            // InternalMyDsl.g:378:2: iv_ruleMovement= ruleMovement EOF
            {
             newCompositeNode(grammarAccess.getMovementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMovement=ruleMovement();

            state._fsp--;

             current =iv_ruleMovement; 
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
    // $ANTLR end "entryRuleMovement"


    // $ANTLR start "ruleMovement"
    // InternalMyDsl.g:384:1: ruleMovement returns [EObject current=null] : ( () otherlv_1= 'Movement' otherlv_2= '{' (otherlv_3= 'direction' ( (lv_direction_4_0= ruleDirection ) ) )? (otherlv_5= 'Distance' ( (lv_Distance_6_0= ruleEInt ) ) )? (otherlv_7= 'unit' ( (lv_unit_8_0= ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleMovement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_direction_4_0 = null;

        AntlrDatatypeRuleToken lv_Distance_6_0 = null;

        AntlrDatatypeRuleToken lv_unit_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:390:2: ( ( () otherlv_1= 'Movement' otherlv_2= '{' (otherlv_3= 'direction' ( (lv_direction_4_0= ruleDirection ) ) )? (otherlv_5= 'Distance' ( (lv_Distance_6_0= ruleEInt ) ) )? (otherlv_7= 'unit' ( (lv_unit_8_0= ruleEString ) ) )? otherlv_9= '}' ) )
            // InternalMyDsl.g:391:2: ( () otherlv_1= 'Movement' otherlv_2= '{' (otherlv_3= 'direction' ( (lv_direction_4_0= ruleDirection ) ) )? (otherlv_5= 'Distance' ( (lv_Distance_6_0= ruleEInt ) ) )? (otherlv_7= 'unit' ( (lv_unit_8_0= ruleEString ) ) )? otherlv_9= '}' )
            {
            // InternalMyDsl.g:391:2: ( () otherlv_1= 'Movement' otherlv_2= '{' (otherlv_3= 'direction' ( (lv_direction_4_0= ruleDirection ) ) )? (otherlv_5= 'Distance' ( (lv_Distance_6_0= ruleEInt ) ) )? (otherlv_7= 'unit' ( (lv_unit_8_0= ruleEString ) ) )? otherlv_9= '}' )
            // InternalMyDsl.g:392:3: () otherlv_1= 'Movement' otherlv_2= '{' (otherlv_3= 'direction' ( (lv_direction_4_0= ruleDirection ) ) )? (otherlv_5= 'Distance' ( (lv_Distance_6_0= ruleEInt ) ) )? (otherlv_7= 'unit' ( (lv_unit_8_0= ruleEString ) ) )? otherlv_9= '}'
            {
            // InternalMyDsl.g:392:3: ()
            // InternalMyDsl.g:393:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMovementAccess().getMovementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMovementAccess().getMovementKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getMovementAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:407:3: (otherlv_3= 'direction' ( (lv_direction_4_0= ruleDirection ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:408:4: otherlv_3= 'direction' ( (lv_direction_4_0= ruleDirection ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getMovementAccess().getDirectionKeyword_3_0());
                    			
                    // InternalMyDsl.g:412:4: ( (lv_direction_4_0= ruleDirection ) )
                    // InternalMyDsl.g:413:5: (lv_direction_4_0= ruleDirection )
                    {
                    // InternalMyDsl.g:413:5: (lv_direction_4_0= ruleDirection )
                    // InternalMyDsl.g:414:6: lv_direction_4_0= ruleDirection
                    {

                    						newCompositeNode(grammarAccess.getMovementAccess().getDirectionDirectionEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_direction_4_0=ruleDirection();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMovementRule());
                    						}
                    						set(
                    							current,
                    							"direction",
                    							lv_direction_4_0,
                    							"org.xtext.example.mydsl1.MyDsl.Direction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:432:3: (otherlv_5= 'Distance' ( (lv_Distance_6_0= ruleEInt ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:433:4: otherlv_5= 'Distance' ( (lv_Distance_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getMovementAccess().getDistanceKeyword_4_0());
                    			
                    // InternalMyDsl.g:437:4: ( (lv_Distance_6_0= ruleEInt ) )
                    // InternalMyDsl.g:438:5: (lv_Distance_6_0= ruleEInt )
                    {
                    // InternalMyDsl.g:438:5: (lv_Distance_6_0= ruleEInt )
                    // InternalMyDsl.g:439:6: lv_Distance_6_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getMovementAccess().getDistanceEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_Distance_6_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMovementRule());
                    						}
                    						set(
                    							current,
                    							"Distance",
                    							lv_Distance_6_0,
                    							"org.xtext.example.mydsl1.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:457:3: (otherlv_7= 'unit' ( (lv_unit_8_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:458:4: otherlv_7= 'unit' ( (lv_unit_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getMovementAccess().getUnitKeyword_5_0());
                    			
                    // InternalMyDsl.g:462:4: ( (lv_unit_8_0= ruleEString ) )
                    // InternalMyDsl.g:463:5: (lv_unit_8_0= ruleEString )
                    {
                    // InternalMyDsl.g:463:5: (lv_unit_8_0= ruleEString )
                    // InternalMyDsl.g:464:6: lv_unit_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMovementAccess().getUnitEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_unit_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMovementRule());
                    						}
                    						set(
                    							current,
                    							"unit",
                    							lv_unit_8_0,
                    							"org.xtext.example.mydsl1.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getMovementAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleMovement"


    // $ANTLR start "entryRuleRotation"
    // InternalMyDsl.g:490:1: entryRuleRotation returns [EObject current=null] : iv_ruleRotation= ruleRotation EOF ;
    public final EObject entryRuleRotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotation = null;


        try {
            // InternalMyDsl.g:490:49: (iv_ruleRotation= ruleRotation EOF )
            // InternalMyDsl.g:491:2: iv_ruleRotation= ruleRotation EOF
            {
             newCompositeNode(grammarAccess.getRotationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRotation=ruleRotation();

            state._fsp--;

             current =iv_ruleRotation; 
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
    // $ANTLR end "entryRuleRotation"


    // $ANTLR start "ruleRotation"
    // InternalMyDsl.g:497:1: ruleRotation returns [EObject current=null] : ( () otherlv_1= 'Rotation' otherlv_2= '{' (otherlv_3= 'angleUnit' ( (lv_angleUnit_4_0= ruleAngleUnit ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleRotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_angleUnit_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:503:2: ( ( () otherlv_1= 'Rotation' otherlv_2= '{' (otherlv_3= 'angleUnit' ( (lv_angleUnit_4_0= ruleAngleUnit ) ) )? otherlv_5= '}' ) )
            // InternalMyDsl.g:504:2: ( () otherlv_1= 'Rotation' otherlv_2= '{' (otherlv_3= 'angleUnit' ( (lv_angleUnit_4_0= ruleAngleUnit ) ) )? otherlv_5= '}' )
            {
            // InternalMyDsl.g:504:2: ( () otherlv_1= 'Rotation' otherlv_2= '{' (otherlv_3= 'angleUnit' ( (lv_angleUnit_4_0= ruleAngleUnit ) ) )? otherlv_5= '}' )
            // InternalMyDsl.g:505:3: () otherlv_1= 'Rotation' otherlv_2= '{' (otherlv_3= 'angleUnit' ( (lv_angleUnit_4_0= ruleAngleUnit ) ) )? otherlv_5= '}'
            {
            // InternalMyDsl.g:505:3: ()
            // InternalMyDsl.g:506:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRotationAccess().getRotationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRotationAccess().getRotationKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getRotationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:520:3: (otherlv_3= 'angleUnit' ( (lv_angleUnit_4_0= ruleAngleUnit ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:521:4: otherlv_3= 'angleUnit' ( (lv_angleUnit_4_0= ruleAngleUnit ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getRotationAccess().getAngleUnitKeyword_3_0());
                    			
                    // InternalMyDsl.g:525:4: ( (lv_angleUnit_4_0= ruleAngleUnit ) )
                    // InternalMyDsl.g:526:5: (lv_angleUnit_4_0= ruleAngleUnit )
                    {
                    // InternalMyDsl.g:526:5: (lv_angleUnit_4_0= ruleAngleUnit )
                    // InternalMyDsl.g:527:6: lv_angleUnit_4_0= ruleAngleUnit
                    {

                    						newCompositeNode(grammarAccess.getRotationAccess().getAngleUnitAngleUnitEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_angleUnit_4_0=ruleAngleUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRotationRule());
                    						}
                    						set(
                    							current,
                    							"angleUnit",
                    							lv_angleUnit_4_0,
                    							"org.xtext.example.mydsl1.MyDsl.AngleUnit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRotationAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleRotation"


    // $ANTLR start "entryRuleLoop"
    // InternalMyDsl.g:553:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalMyDsl.g:553:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalMyDsl.g:554:2: iv_ruleLoop= ruleLoop EOF
            {
             newCompositeNode(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoop=ruleLoop();

            state._fsp--;

             current =iv_ruleLoop; 
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
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // InternalMyDsl.g:560:1: ruleLoop returns [EObject current=null] : ( () otherlv_1= 'Loop' otherlv_2= '{' (otherlv_3= 'instruction' otherlv_4= '{' ( (lv_instruction_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instruction_7_0= ruleInstruction ) ) )* otherlv_8= '}' )? (otherlv_9= 'booleanexpr' ( (lv_booleanexpr_10_0= ruleBooleanExpr ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_instruction_5_0 = null;

        EObject lv_instruction_7_0 = null;

        EObject lv_booleanexpr_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:566:2: ( ( () otherlv_1= 'Loop' otherlv_2= '{' (otherlv_3= 'instruction' otherlv_4= '{' ( (lv_instruction_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instruction_7_0= ruleInstruction ) ) )* otherlv_8= '}' )? (otherlv_9= 'booleanexpr' ( (lv_booleanexpr_10_0= ruleBooleanExpr ) ) )? otherlv_11= '}' ) )
            // InternalMyDsl.g:567:2: ( () otherlv_1= 'Loop' otherlv_2= '{' (otherlv_3= 'instruction' otherlv_4= '{' ( (lv_instruction_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instruction_7_0= ruleInstruction ) ) )* otherlv_8= '}' )? (otherlv_9= 'booleanexpr' ( (lv_booleanexpr_10_0= ruleBooleanExpr ) ) )? otherlv_11= '}' )
            {
            // InternalMyDsl.g:567:2: ( () otherlv_1= 'Loop' otherlv_2= '{' (otherlv_3= 'instruction' otherlv_4= '{' ( (lv_instruction_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instruction_7_0= ruleInstruction ) ) )* otherlv_8= '}' )? (otherlv_9= 'booleanexpr' ( (lv_booleanexpr_10_0= ruleBooleanExpr ) ) )? otherlv_11= '}' )
            // InternalMyDsl.g:568:3: () otherlv_1= 'Loop' otherlv_2= '{' (otherlv_3= 'instruction' otherlv_4= '{' ( (lv_instruction_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instruction_7_0= ruleInstruction ) ) )* otherlv_8= '}' )? (otherlv_9= 'booleanexpr' ( (lv_booleanexpr_10_0= ruleBooleanExpr ) ) )? otherlv_11= '}'
            {
            // InternalMyDsl.g:568:3: ()
            // InternalMyDsl.g:569:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLoopAccess().getLoopAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopAccess().getLoopKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:583:3: (otherlv_3= 'instruction' otherlv_4= '{' ( (lv_instruction_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instruction_7_0= ruleInstruction ) ) )* otherlv_8= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==13) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:584:4: otherlv_3= 'instruction' otherlv_4= '{' ( (lv_instruction_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instruction_7_0= ruleInstruction ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getLoopAccess().getInstructionKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalMyDsl.g:592:4: ( (lv_instruction_5_0= ruleInstruction ) )
                    // InternalMyDsl.g:593:5: (lv_instruction_5_0= ruleInstruction )
                    {
                    // InternalMyDsl.g:593:5: (lv_instruction_5_0= ruleInstruction )
                    // InternalMyDsl.g:594:6: lv_instruction_5_0= ruleInstruction
                    {

                    						newCompositeNode(grammarAccess.getLoopAccess().getInstructionInstructionParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_instruction_5_0=ruleInstruction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLoopRule());
                    						}
                    						add(
                    							current,
                    							"instruction",
                    							lv_instruction_5_0,
                    							"org.xtext.example.mydsl1.MyDsl.Instruction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:611:4: (otherlv_6= ',' ( (lv_instruction_7_0= ruleInstruction ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==14) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalMyDsl.g:612:5: otherlv_6= ',' ( (lv_instruction_7_0= ruleInstruction ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getLoopAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalMyDsl.g:616:5: ( (lv_instruction_7_0= ruleInstruction ) )
                    	    // InternalMyDsl.g:617:6: (lv_instruction_7_0= ruleInstruction )
                    	    {
                    	    // InternalMyDsl.g:617:6: (lv_instruction_7_0= ruleInstruction )
                    	    // InternalMyDsl.g:618:7: lv_instruction_7_0= ruleInstruction
                    	    {

                    	    							newCompositeNode(grammarAccess.getLoopAccess().getInstructionInstructionParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_instruction_7_0=ruleInstruction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLoopRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"instruction",
                    	    								lv_instruction_7_0,
                    	    								"org.xtext.example.mydsl1.MyDsl.Instruction");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:641:3: (otherlv_9= 'booleanexpr' ( (lv_booleanexpr_10_0= ruleBooleanExpr ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:642:4: otherlv_9= 'booleanexpr' ( (lv_booleanexpr_10_0= ruleBooleanExpr ) )
                    {
                    otherlv_9=(Token)match(input,23,FOLLOW_18); 

                    				newLeafNode(otherlv_9, grammarAccess.getLoopAccess().getBooleanexprKeyword_4_0());
                    			
                    // InternalMyDsl.g:646:4: ( (lv_booleanexpr_10_0= ruleBooleanExpr ) )
                    // InternalMyDsl.g:647:5: (lv_booleanexpr_10_0= ruleBooleanExpr )
                    {
                    // InternalMyDsl.g:647:5: (lv_booleanexpr_10_0= ruleBooleanExpr )
                    // InternalMyDsl.g:648:6: lv_booleanexpr_10_0= ruleBooleanExpr
                    {

                    						newCompositeNode(grammarAccess.getLoopAccess().getBooleanexprBooleanExprParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_booleanexpr_10_0=ruleBooleanExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLoopRule());
                    						}
                    						set(
                    							current,
                    							"booleanexpr",
                    							lv_booleanexpr_10_0,
                    							"org.xtext.example.mydsl1.MyDsl.BooleanExpr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleCondition"
    // InternalMyDsl.g:674:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalMyDsl.g:674:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalMyDsl.g:675:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalMyDsl.g:681:1: ruleCondition returns [EObject current=null] : ( () otherlv_1= 'Condition' otherlv_2= '{' (otherlv_3= 'then' ( ( ruleEString ) ) )? (otherlv_5= 'else' ( ( ruleEString ) ) )? (otherlv_7= 'booleanexpr' otherlv_8= '{' ( (lv_booleanexpr_9_0= ruleBooleanExpr ) ) (otherlv_10= ',' ( (lv_booleanexpr_11_0= ruleBooleanExpr ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_booleanexpr_9_0 = null;

        EObject lv_booleanexpr_11_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:687:2: ( ( () otherlv_1= 'Condition' otherlv_2= '{' (otherlv_3= 'then' ( ( ruleEString ) ) )? (otherlv_5= 'else' ( ( ruleEString ) ) )? (otherlv_7= 'booleanexpr' otherlv_8= '{' ( (lv_booleanexpr_9_0= ruleBooleanExpr ) ) (otherlv_10= ',' ( (lv_booleanexpr_11_0= ruleBooleanExpr ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // InternalMyDsl.g:688:2: ( () otherlv_1= 'Condition' otherlv_2= '{' (otherlv_3= 'then' ( ( ruleEString ) ) )? (otherlv_5= 'else' ( ( ruleEString ) ) )? (otherlv_7= 'booleanexpr' otherlv_8= '{' ( (lv_booleanexpr_9_0= ruleBooleanExpr ) ) (otherlv_10= ',' ( (lv_booleanexpr_11_0= ruleBooleanExpr ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // InternalMyDsl.g:688:2: ( () otherlv_1= 'Condition' otherlv_2= '{' (otherlv_3= 'then' ( ( ruleEString ) ) )? (otherlv_5= 'else' ( ( ruleEString ) ) )? (otherlv_7= 'booleanexpr' otherlv_8= '{' ( (lv_booleanexpr_9_0= ruleBooleanExpr ) ) (otherlv_10= ',' ( (lv_booleanexpr_11_0= ruleBooleanExpr ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // InternalMyDsl.g:689:3: () otherlv_1= 'Condition' otherlv_2= '{' (otherlv_3= 'then' ( ( ruleEString ) ) )? (otherlv_5= 'else' ( ( ruleEString ) ) )? (otherlv_7= 'booleanexpr' otherlv_8= '{' ( (lv_booleanexpr_9_0= ruleBooleanExpr ) ) (otherlv_10= ',' ( (lv_booleanexpr_11_0= ruleBooleanExpr ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            // InternalMyDsl.g:689:3: ()
            // InternalMyDsl.g:690:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConditionAccess().getConditionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getConditionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:704:3: (otherlv_3= 'then' ( ( ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:705:4: otherlv_3= 'then' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getThenKeyword_3_0());
                    			
                    // InternalMyDsl.g:709:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:710:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:710:5: ( ruleEString )
                    // InternalMyDsl.g:711:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getConditionAccess().getThenInstructionCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:726:3: (otherlv_5= 'else' ( ( ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:727:4: otherlv_5= 'else' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getConditionAccess().getElseKeyword_4_0());
                    			
                    // InternalMyDsl.g:731:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:732:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:732:5: ( ruleEString )
                    // InternalMyDsl.g:733:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getConditionAccess().getElseInstructionCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:748:3: (otherlv_7= 'booleanexpr' otherlv_8= '{' ( (lv_booleanexpr_9_0= ruleBooleanExpr ) ) (otherlv_10= ',' ( (lv_booleanexpr_11_0= ruleBooleanExpr ) ) )* otherlv_12= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:749:4: otherlv_7= 'booleanexpr' otherlv_8= '{' ( (lv_booleanexpr_9_0= ruleBooleanExpr ) ) (otherlv_10= ',' ( (lv_booleanexpr_11_0= ruleBooleanExpr ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getConditionAccess().getBooleanexprKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_8, grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMyDsl.g:757:4: ( (lv_booleanexpr_9_0= ruleBooleanExpr ) )
                    // InternalMyDsl.g:758:5: (lv_booleanexpr_9_0= ruleBooleanExpr )
                    {
                    // InternalMyDsl.g:758:5: (lv_booleanexpr_9_0= ruleBooleanExpr )
                    // InternalMyDsl.g:759:6: lv_booleanexpr_9_0= ruleBooleanExpr
                    {

                    						newCompositeNode(grammarAccess.getConditionAccess().getBooleanexprBooleanExprParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_booleanexpr_9_0=ruleBooleanExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionRule());
                    						}
                    						add(
                    							current,
                    							"booleanexpr",
                    							lv_booleanexpr_9_0,
                    							"org.xtext.example.mydsl1.MyDsl.BooleanExpr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:776:4: (otherlv_10= ',' ( (lv_booleanexpr_11_0= ruleBooleanExpr ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==14) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalMyDsl.g:777:5: otherlv_10= ',' ( (lv_booleanexpr_11_0= ruleBooleanExpr ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FOLLOW_18); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getConditionAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMyDsl.g:781:5: ( (lv_booleanexpr_11_0= ruleBooleanExpr ) )
                    	    // InternalMyDsl.g:782:6: (lv_booleanexpr_11_0= ruleBooleanExpr )
                    	    {
                    	    // InternalMyDsl.g:782:6: (lv_booleanexpr_11_0= ruleBooleanExpr )
                    	    // InternalMyDsl.g:783:7: lv_booleanexpr_11_0= ruleBooleanExpr
                    	    {

                    	    							newCompositeNode(grammarAccess.getConditionAccess().getBooleanexprBooleanExprParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_booleanexpr_11_0=ruleBooleanExpr();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConditionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"booleanexpr",
                    	    								lv_booleanexpr_11_0,
                    	    								"org.xtext.example.mydsl1.MyDsl.BooleanExpr");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_12, grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleVariableAssignement"
    // InternalMyDsl.g:814:1: entryRuleVariableAssignement returns [EObject current=null] : iv_ruleVariableAssignement= ruleVariableAssignement EOF ;
    public final EObject entryRuleVariableAssignement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAssignement = null;


        try {
            // InternalMyDsl.g:814:60: (iv_ruleVariableAssignement= ruleVariableAssignement EOF )
            // InternalMyDsl.g:815:2: iv_ruleVariableAssignement= ruleVariableAssignement EOF
            {
             newCompositeNode(grammarAccess.getVariableAssignementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableAssignement=ruleVariableAssignement();

            state._fsp--;

             current =iv_ruleVariableAssignement; 
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
    // $ANTLR end "entryRuleVariableAssignement"


    // $ANTLR start "ruleVariableAssignement"
    // InternalMyDsl.g:821:1: ruleVariableAssignement returns [EObject current=null] : ( () otherlv_1= 'VariableAssignement' otherlv_2= '{' (otherlv_3= 'variabledeclaration' ( ( ruleEString ) ) )? (otherlv_5= 'expression' otherlv_6= '{' ( (lv_expression_7_0= ruleExpression ) ) (otherlv_8= ',' ( (lv_expression_9_0= ruleExpression ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleVariableAssignement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_expression_7_0 = null;

        EObject lv_expression_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:827:2: ( ( () otherlv_1= 'VariableAssignement' otherlv_2= '{' (otherlv_3= 'variabledeclaration' ( ( ruleEString ) ) )? (otherlv_5= 'expression' otherlv_6= '{' ( (lv_expression_7_0= ruleExpression ) ) (otherlv_8= ',' ( (lv_expression_9_0= ruleExpression ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalMyDsl.g:828:2: ( () otherlv_1= 'VariableAssignement' otherlv_2= '{' (otherlv_3= 'variabledeclaration' ( ( ruleEString ) ) )? (otherlv_5= 'expression' otherlv_6= '{' ( (lv_expression_7_0= ruleExpression ) ) (otherlv_8= ',' ( (lv_expression_9_0= ruleExpression ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalMyDsl.g:828:2: ( () otherlv_1= 'VariableAssignement' otherlv_2= '{' (otherlv_3= 'variabledeclaration' ( ( ruleEString ) ) )? (otherlv_5= 'expression' otherlv_6= '{' ( (lv_expression_7_0= ruleExpression ) ) (otherlv_8= ',' ( (lv_expression_9_0= ruleExpression ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalMyDsl.g:829:3: () otherlv_1= 'VariableAssignement' otherlv_2= '{' (otherlv_3= 'variabledeclaration' ( ( ruleEString ) ) )? (otherlv_5= 'expression' otherlv_6= '{' ( (lv_expression_7_0= ruleExpression ) ) (otherlv_8= ',' ( (lv_expression_9_0= ruleExpression ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalMyDsl.g:829:3: ()
            // InternalMyDsl.g:830:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableAssignementAccess().getVariableAssignementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableAssignementAccess().getVariableAssignementKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableAssignementAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:844:3: (otherlv_3= 'variabledeclaration' ( ( ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:845:4: otherlv_3= 'variabledeclaration' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getVariableAssignementAccess().getVariabledeclarationKeyword_3_0());
                    			
                    // InternalMyDsl.g:849:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:850:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:850:5: ( ruleEString )
                    // InternalMyDsl.g:851:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVariableAssignementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getVariableAssignementAccess().getVariabledeclarationVariableDeclarationCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:866:3: (otherlv_5= 'expression' otherlv_6= '{' ( (lv_expression_7_0= ruleExpression ) ) (otherlv_8= ',' ( (lv_expression_9_0= ruleExpression ) ) )* otherlv_10= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:867:4: otherlv_5= 'expression' otherlv_6= '{' ( (lv_expression_7_0= ruleExpression ) ) (otherlv_8= ',' ( (lv_expression_9_0= ruleExpression ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getVariableAssignementAccess().getExpressionKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_6, grammarAccess.getVariableAssignementAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyDsl.g:875:4: ( (lv_expression_7_0= ruleExpression ) )
                    // InternalMyDsl.g:876:5: (lv_expression_7_0= ruleExpression )
                    {
                    // InternalMyDsl.g:876:5: (lv_expression_7_0= ruleExpression )
                    // InternalMyDsl.g:877:6: lv_expression_7_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getVariableAssignementAccess().getExpressionExpressionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_expression_7_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableAssignementRule());
                    						}
                    						add(
                    							current,
                    							"expression",
                    							lv_expression_7_0,
                    							"org.xtext.example.mydsl1.MyDsl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:894:4: (otherlv_8= ',' ( (lv_expression_9_0= ruleExpression ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==14) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalMyDsl.g:895:5: otherlv_8= ',' ( (lv_expression_9_0= ruleExpression ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_23); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getVariableAssignementAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:899:5: ( (lv_expression_9_0= ruleExpression ) )
                    	    // InternalMyDsl.g:900:6: (lv_expression_9_0= ruleExpression )
                    	    {
                    	    // InternalMyDsl.g:900:6: (lv_expression_9_0= ruleExpression )
                    	    // InternalMyDsl.g:901:7: lv_expression_9_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getVariableAssignementAccess().getExpressionExpressionParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_expression_9_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getVariableAssignementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"expression",
                    	    								lv_expression_9_0,
                    	    								"org.xtext.example.mydsl1.MyDsl.Expression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getVariableAssignementAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getVariableAssignementAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleVariableAssignement"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalMyDsl.g:932:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalMyDsl.g:932:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalMyDsl.g:933:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
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
    // InternalMyDsl.g:939:1: ruleVariableDeclaration returns [EObject current=null] : ( () otherlv_1= 'VariableDeclaration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'expression' otherlv_7= '{' ( (lv_expression_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_expression_10_0= ruleExpression ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
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
            // InternalMyDsl.g:945:2: ( ( () otherlv_1= 'VariableDeclaration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'expression' otherlv_7= '{' ( (lv_expression_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_expression_10_0= ruleExpression ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalMyDsl.g:946:2: ( () otherlv_1= 'VariableDeclaration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'expression' otherlv_7= '{' ( (lv_expression_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_expression_10_0= ruleExpression ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalMyDsl.g:946:2: ( () otherlv_1= 'VariableDeclaration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'expression' otherlv_7= '{' ( (lv_expression_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_expression_10_0= ruleExpression ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalMyDsl.g:947:3: () otherlv_1= 'VariableDeclaration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'expression' otherlv_7= '{' ( (lv_expression_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_expression_10_0= ruleExpression ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalMyDsl.g:947:3: ()
            // InternalMyDsl.g:948:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableDeclarationAccess().getVariableDeclarationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableDeclarationAccess().getVariableDeclarationKeyword_1());
            		
            // InternalMyDsl.g:958:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:959:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:959:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:960:5: lv_name_2_0= ruleEString
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
            						"org.xtext.example.mydsl1.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getVariableDeclarationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:981:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:982:4: otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getVariableDeclarationAccess().getTypeKeyword_4_0());
                    			
                    // InternalMyDsl.g:986:4: ( (lv_type_5_0= ruleEString ) )
                    // InternalMyDsl.g:987:5: (lv_type_5_0= ruleEString )
                    {
                    // InternalMyDsl.g:987:5: (lv_type_5_0= ruleEString )
                    // InternalMyDsl.g:988:6: lv_type_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_type_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"org.xtext.example.mydsl1.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1006:3: (otherlv_6= 'expression' otherlv_7= '{' ( (lv_expression_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_expression_10_0= ruleExpression ) ) )* otherlv_11= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:1007:4: otherlv_6= 'expression' otherlv_7= '{' ( (lv_expression_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_expression_10_0= ruleExpression ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getVariableDeclarationAccess().getExpressionKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_7, grammarAccess.getVariableDeclarationAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMyDsl.g:1015:4: ( (lv_expression_8_0= ruleExpression ) )
                    // InternalMyDsl.g:1016:5: (lv_expression_8_0= ruleExpression )
                    {
                    // InternalMyDsl.g:1016:5: (lv_expression_8_0= ruleExpression )
                    // InternalMyDsl.g:1017:6: lv_expression_8_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getVariableDeclarationAccess().getExpressionExpressionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_expression_8_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                    						}
                    						add(
                    							current,
                    							"expression",
                    							lv_expression_8_0,
                    							"org.xtext.example.mydsl1.MyDsl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1034:4: (otherlv_9= ',' ( (lv_expression_10_0= ruleExpression ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==14) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalMyDsl.g:1035:5: otherlv_9= ',' ( (lv_expression_10_0= ruleExpression ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_23); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getVariableDeclarationAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMyDsl.g:1039:5: ( (lv_expression_10_0= ruleExpression ) )
                    	    // InternalMyDsl.g:1040:6: (lv_expression_10_0= ruleExpression )
                    	    {
                    	    // InternalMyDsl.g:1040:6: (lv_expression_10_0= ruleExpression )
                    	    // InternalMyDsl.g:1041:7: lv_expression_10_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getVariableDeclarationAccess().getExpressionExpressionParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_expression_10_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"expression",
                    	    								lv_expression_10_0,
                    	    								"org.xtext.example.mydsl1.MyDsl.Expression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_11, grammarAccess.getVariableDeclarationAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "entryRuleFunctionDeclaration"
    // InternalMyDsl.g:1072:1: entryRuleFunctionDeclaration returns [EObject current=null] : iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF ;
    public final EObject entryRuleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDeclaration = null;


        try {
            // InternalMyDsl.g:1072:60: (iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF )
            // InternalMyDsl.g:1073:2: iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF
            {
             newCompositeNode(grammarAccess.getFunctionDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionDeclaration=ruleFunctionDeclaration();

            state._fsp--;

             current =iv_ruleFunctionDeclaration; 
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
    // $ANTLR end "entryRuleFunctionDeclaration"


    // $ANTLR start "ruleFunctionDeclaration"
    // InternalMyDsl.g:1079:1: ruleFunctionDeclaration returns [EObject current=null] : ( () otherlv_1= 'FunctionDeclaration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instruction' otherlv_5= '{' ( (lv_instruction_6_0= ruleInstruction ) ) (otherlv_7= ',' ( (lv_instruction_8_0= ruleInstruction ) ) )* otherlv_9= '}' )? (otherlv_10= 'returntype' ( (lv_returntype_11_0= ruleReturnType ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_instruction_6_0 = null;

        EObject lv_instruction_8_0 = null;

        EObject lv_returntype_11_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1085:2: ( ( () otherlv_1= 'FunctionDeclaration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instruction' otherlv_5= '{' ( (lv_instruction_6_0= ruleInstruction ) ) (otherlv_7= ',' ( (lv_instruction_8_0= ruleInstruction ) ) )* otherlv_9= '}' )? (otherlv_10= 'returntype' ( (lv_returntype_11_0= ruleReturnType ) ) )? otherlv_12= '}' ) )
            // InternalMyDsl.g:1086:2: ( () otherlv_1= 'FunctionDeclaration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instruction' otherlv_5= '{' ( (lv_instruction_6_0= ruleInstruction ) ) (otherlv_7= ',' ( (lv_instruction_8_0= ruleInstruction ) ) )* otherlv_9= '}' )? (otherlv_10= 'returntype' ( (lv_returntype_11_0= ruleReturnType ) ) )? otherlv_12= '}' )
            {
            // InternalMyDsl.g:1086:2: ( () otherlv_1= 'FunctionDeclaration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instruction' otherlv_5= '{' ( (lv_instruction_6_0= ruleInstruction ) ) (otherlv_7= ',' ( (lv_instruction_8_0= ruleInstruction ) ) )* otherlv_9= '}' )? (otherlv_10= 'returntype' ( (lv_returntype_11_0= ruleReturnType ) ) )? otherlv_12= '}' )
            // InternalMyDsl.g:1087:3: () otherlv_1= 'FunctionDeclaration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instruction' otherlv_5= '{' ( (lv_instruction_6_0= ruleInstruction ) ) (otherlv_7= ',' ( (lv_instruction_8_0= ruleInstruction ) ) )* otherlv_9= '}' )? (otherlv_10= 'returntype' ( (lv_returntype_11_0= ruleReturnType ) ) )? otherlv_12= '}'
            {
            // InternalMyDsl.g:1087:3: ()
            // InternalMyDsl.g:1088:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFunctionDeclarationAccess().getFunctionDeclarationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionDeclarationAccess().getFunctionDeclarationKeyword_1());
            		
            // InternalMyDsl.g:1098:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:1099:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:1099:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:1100:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl1.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getFunctionDeclarationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:1121:3: (otherlv_4= 'instruction' otherlv_5= '{' ( (lv_instruction_6_0= ruleInstruction ) ) (otherlv_7= ',' ( (lv_instruction_8_0= ruleInstruction ) ) )* otherlv_9= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==13) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:1122:4: otherlv_4= 'instruction' otherlv_5= '{' ( (lv_instruction_6_0= ruleInstruction ) ) (otherlv_7= ',' ( (lv_instruction_8_0= ruleInstruction ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getFunctionDeclarationAccess().getInstructionKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getFunctionDeclarationAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyDsl.g:1130:4: ( (lv_instruction_6_0= ruleInstruction ) )
                    // InternalMyDsl.g:1131:5: (lv_instruction_6_0= ruleInstruction )
                    {
                    // InternalMyDsl.g:1131:5: (lv_instruction_6_0= ruleInstruction )
                    // InternalMyDsl.g:1132:6: lv_instruction_6_0= ruleInstruction
                    {

                    						newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getInstructionInstructionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_instruction_6_0=ruleInstruction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
                    						}
                    						add(
                    							current,
                    							"instruction",
                    							lv_instruction_6_0,
                    							"org.xtext.example.mydsl1.MyDsl.Instruction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1149:4: (otherlv_7= ',' ( (lv_instruction_8_0= ruleInstruction ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==14) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalMyDsl.g:1150:5: otherlv_7= ',' ( (lv_instruction_8_0= ruleInstruction ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getFunctionDeclarationAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:1154:5: ( (lv_instruction_8_0= ruleInstruction ) )
                    	    // InternalMyDsl.g:1155:6: (lv_instruction_8_0= ruleInstruction )
                    	    {
                    	    // InternalMyDsl.g:1155:6: (lv_instruction_8_0= ruleInstruction )
                    	    // InternalMyDsl.g:1156:7: lv_instruction_8_0= ruleInstruction
                    	    {

                    	    							newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getInstructionInstructionParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_instruction_8_0=ruleInstruction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"instruction",
                    	    								lv_instruction_8_0,
                    	    								"org.xtext.example.mydsl1.MyDsl.Instruction");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_26); 

                    				newLeafNode(otherlv_9, grammarAccess.getFunctionDeclarationAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1179:3: (otherlv_10= 'returntype' ( (lv_returntype_11_0= ruleReturnType ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==33) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:1180:4: otherlv_10= 'returntype' ( (lv_returntype_11_0= ruleReturnType ) )
                    {
                    otherlv_10=(Token)match(input,33,FOLLOW_27); 

                    				newLeafNode(otherlv_10, grammarAccess.getFunctionDeclarationAccess().getReturntypeKeyword_5_0());
                    			
                    // InternalMyDsl.g:1184:4: ( (lv_returntype_11_0= ruleReturnType ) )
                    // InternalMyDsl.g:1185:5: (lv_returntype_11_0= ruleReturnType )
                    {
                    // InternalMyDsl.g:1185:5: (lv_returntype_11_0= ruleReturnType )
                    // InternalMyDsl.g:1186:6: lv_returntype_11_0= ruleReturnType
                    {

                    						newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getReturntypeReturnTypeParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_returntype_11_0=ruleReturnType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
                    						}
                    						set(
                    							current,
                    							"returntype",
                    							lv_returntype_11_0,
                    							"org.xtext.example.mydsl1.MyDsl.ReturnType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getFunctionDeclarationAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleFunctionDeclaration"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalMyDsl.g:1212:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalMyDsl.g:1212:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalMyDsl.g:1213:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
             newCompositeNode(grammarAccess.getFunctionCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;

             current =iv_ruleFunctionCall; 
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
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // InternalMyDsl.g:1219:1: ruleFunctionCall returns [EObject current=null] : ( () otherlv_1= 'FunctionCall' otherlv_2= '{' (otherlv_3= 'functiondeclaration' ( ( ruleEString ) ) )? (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_parameter_7_0 = null;

        EObject lv_parameter_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1225:2: ( ( () otherlv_1= 'FunctionCall' otherlv_2= '{' (otherlv_3= 'functiondeclaration' ( ( ruleEString ) ) )? (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalMyDsl.g:1226:2: ( () otherlv_1= 'FunctionCall' otherlv_2= '{' (otherlv_3= 'functiondeclaration' ( ( ruleEString ) ) )? (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalMyDsl.g:1226:2: ( () otherlv_1= 'FunctionCall' otherlv_2= '{' (otherlv_3= 'functiondeclaration' ( ( ruleEString ) ) )? (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalMyDsl.g:1227:3: () otherlv_1= 'FunctionCall' otherlv_2= '{' (otherlv_3= 'functiondeclaration' ( ( ruleEString ) ) )? (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalMyDsl.g:1227:3: ()
            // InternalMyDsl.g:1228:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFunctionCallAccess().getFunctionCallAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getFunctionCallKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1242:3: (otherlv_3= 'functiondeclaration' ( ( ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==35) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:1243:4: otherlv_3= 'functiondeclaration' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getFunctiondeclarationKeyword_3_0());
                    			
                    // InternalMyDsl.g:1247:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:1248:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:1248:5: ( ruleEString )
                    // InternalMyDsl.g:1249:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFunctionCallRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFunctionCallAccess().getFunctiondeclarationFunctionDeclarationCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1264:3: (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )* otherlv_10= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==36) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:1265:4: otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getFunctionCallAccess().getParameterKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_30); 

                    				newLeafNode(otherlv_6, grammarAccess.getFunctionCallAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyDsl.g:1273:4: ( (lv_parameter_7_0= ruleParameter ) )
                    // InternalMyDsl.g:1274:5: (lv_parameter_7_0= ruleParameter )
                    {
                    // InternalMyDsl.g:1274:5: (lv_parameter_7_0= ruleParameter )
                    // InternalMyDsl.g:1275:6: lv_parameter_7_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getFunctionCallAccess().getParameterParameterParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_parameter_7_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    						}
                    						add(
                    							current,
                    							"parameter",
                    							lv_parameter_7_0,
                    							"org.xtext.example.mydsl1.MyDsl.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1292:4: (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==14) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalMyDsl.g:1293:5: otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_30); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getFunctionCallAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:1297:5: ( (lv_parameter_9_0= ruleParameter ) )
                    	    // InternalMyDsl.g:1298:6: (lv_parameter_9_0= ruleParameter )
                    	    {
                    	    // InternalMyDsl.g:1298:6: (lv_parameter_9_0= ruleParameter )
                    	    // InternalMyDsl.g:1299:7: lv_parameter_9_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getFunctionCallAccess().getParameterParameterParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_parameter_9_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameter",
                    	    								lv_parameter_9_0,
                    	    								"org.xtext.example.mydsl1.MyDsl.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getFunctionCallAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getFunctionCallAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:1330:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMyDsl.g:1330:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMyDsl.g:1331:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalMyDsl.g:1337:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1343:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMyDsl.g:1344:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMyDsl.g:1344:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMyDsl.g:1345:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMyDsl.g:1345:3: (kw= '-' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==37) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:1346:4: kw= '-'
                    {
                    kw=(Token)match(input,37,FOLLOW_31); 

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


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:1363:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:1363:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:1364:2: iv_ruleEString= ruleEString EOF
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
    // InternalMyDsl.g:1370:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1376:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:1377:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:1377:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_STRING) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_ID) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:1378:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1386:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleBooleanExpr"
    // InternalMyDsl.g:1397:1: entryRuleBooleanExpr returns [EObject current=null] : iv_ruleBooleanExpr= ruleBooleanExpr EOF ;
    public final EObject entryRuleBooleanExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpr = null;


        try {
            // InternalMyDsl.g:1397:52: (iv_ruleBooleanExpr= ruleBooleanExpr EOF )
            // InternalMyDsl.g:1398:2: iv_ruleBooleanExpr= ruleBooleanExpr EOF
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
    // InternalMyDsl.g:1404:1: ruleBooleanExpr returns [EObject current=null] : ( () otherlv_1= 'BooleanExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleBooleanOperator ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? (otherlv_11= 'right' ( (lv_right_12_0= ruleExpression ) ) )? (otherlv_13= 'left' ( (lv_left_14_0= ruleExpression ) ) )? otherlv_15= '}' ) ;
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
            // InternalMyDsl.g:1410:2: ( ( () otherlv_1= 'BooleanExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleBooleanOperator ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? (otherlv_11= 'right' ( (lv_right_12_0= ruleExpression ) ) )? (otherlv_13= 'left' ( (lv_left_14_0= ruleExpression ) ) )? otherlv_15= '}' ) )
            // InternalMyDsl.g:1411:2: ( () otherlv_1= 'BooleanExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleBooleanOperator ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? (otherlv_11= 'right' ( (lv_right_12_0= ruleExpression ) ) )? (otherlv_13= 'left' ( (lv_left_14_0= ruleExpression ) ) )? otherlv_15= '}' )
            {
            // InternalMyDsl.g:1411:2: ( () otherlv_1= 'BooleanExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleBooleanOperator ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? (otherlv_11= 'right' ( (lv_right_12_0= ruleExpression ) ) )? (otherlv_13= 'left' ( (lv_left_14_0= ruleExpression ) ) )? otherlv_15= '}' )
            // InternalMyDsl.g:1412:3: () otherlv_1= 'BooleanExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleBooleanOperator ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? (otherlv_11= 'right' ( (lv_right_12_0= ruleExpression ) ) )? (otherlv_13= 'left' ( (lv_left_14_0= ruleExpression ) ) )? otherlv_15= '}'
            {
            // InternalMyDsl.g:1412:3: ()
            // InternalMyDsl.g:1413:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanExprAccess().getBooleanExprAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBooleanExprAccess().getBooleanExprKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getBooleanExprAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1427:3: (otherlv_3= 'operator' ( (lv_operator_4_0= ruleBooleanOperator ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==39) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:1428:4: otherlv_3= 'operator' ( (lv_operator_4_0= ruleBooleanOperator ) )
                    {
                    otherlv_3=(Token)match(input,39,FOLLOW_33); 

                    				newLeafNode(otherlv_3, grammarAccess.getBooleanExprAccess().getOperatorKeyword_3_0());
                    			
                    // InternalMyDsl.g:1432:4: ( (lv_operator_4_0= ruleBooleanOperator ) )
                    // InternalMyDsl.g:1433:5: (lv_operator_4_0= ruleBooleanOperator )
                    {
                    // InternalMyDsl.g:1433:5: (lv_operator_4_0= ruleBooleanOperator )
                    // InternalMyDsl.g:1434:6: lv_operator_4_0= ruleBooleanOperator
                    {

                    						newCompositeNode(grammarAccess.getBooleanExprAccess().getOperatorBooleanOperatorEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_operator_4_0=ruleBooleanOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBooleanExprRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_4_0,
                    							"org.xtext.example.mydsl1.MyDsl.BooleanOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1452:3: (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==40) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:1453:4: otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getBooleanExprAccess().getNewvariableKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_35); 

                    				newLeafNode(otherlv_6, grammarAccess.getBooleanExprAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyDsl.g:1461:4: ( (lv_newvariable_7_0= ruleVariableDeclaration ) )
                    // InternalMyDsl.g:1462:5: (lv_newvariable_7_0= ruleVariableDeclaration )
                    {
                    // InternalMyDsl.g:1462:5: (lv_newvariable_7_0= ruleVariableDeclaration )
                    // InternalMyDsl.g:1463:6: lv_newvariable_7_0= ruleVariableDeclaration
                    {

                    						newCompositeNode(grammarAccess.getBooleanExprAccess().getNewvariableVariableDeclarationParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_newvariable_7_0=ruleVariableDeclaration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBooleanExprRule());
                    						}
                    						add(
                    							current,
                    							"newvariable",
                    							lv_newvariable_7_0,
                    							"org.xtext.example.mydsl1.MyDsl.VariableDeclaration");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1480:4: (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==14) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalMyDsl.g:1481:5: otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_35); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getBooleanExprAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:1485:5: ( (lv_newvariable_9_0= ruleVariableDeclaration ) )
                    	    // InternalMyDsl.g:1486:6: (lv_newvariable_9_0= ruleVariableDeclaration )
                    	    {
                    	    // InternalMyDsl.g:1486:6: (lv_newvariable_9_0= ruleVariableDeclaration )
                    	    // InternalMyDsl.g:1487:7: lv_newvariable_9_0= ruleVariableDeclaration
                    	    {

                    	    							newCompositeNode(grammarAccess.getBooleanExprAccess().getNewvariableVariableDeclarationParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_newvariable_9_0=ruleVariableDeclaration();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBooleanExprRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"newvariable",
                    	    								lv_newvariable_9_0,
                    	    								"org.xtext.example.mydsl1.MyDsl.VariableDeclaration");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_36); 

                    				newLeafNode(otherlv_10, grammarAccess.getBooleanExprAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1510:3: (otherlv_11= 'right' ( (lv_right_12_0= ruleExpression ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==41) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:1511:4: otherlv_11= 'right' ( (lv_right_12_0= ruleExpression ) )
                    {
                    otherlv_11=(Token)match(input,41,FOLLOW_23); 

                    				newLeafNode(otherlv_11, grammarAccess.getBooleanExprAccess().getRightKeyword_5_0());
                    			
                    // InternalMyDsl.g:1515:4: ( (lv_right_12_0= ruleExpression ) )
                    // InternalMyDsl.g:1516:5: (lv_right_12_0= ruleExpression )
                    {
                    // InternalMyDsl.g:1516:5: (lv_right_12_0= ruleExpression )
                    // InternalMyDsl.g:1517:6: lv_right_12_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getBooleanExprAccess().getRightExpressionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_right_12_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBooleanExprRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_12_0,
                    							"org.xtext.example.mydsl1.MyDsl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1535:3: (otherlv_13= 'left' ( (lv_left_14_0= ruleExpression ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==42) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:1536:4: otherlv_13= 'left' ( (lv_left_14_0= ruleExpression ) )
                    {
                    otherlv_13=(Token)match(input,42,FOLLOW_23); 

                    				newLeafNode(otherlv_13, grammarAccess.getBooleanExprAccess().getLeftKeyword_6_0());
                    			
                    // InternalMyDsl.g:1540:4: ( (lv_left_14_0= ruleExpression ) )
                    // InternalMyDsl.g:1541:5: (lv_left_14_0= ruleExpression )
                    {
                    // InternalMyDsl.g:1541:5: (lv_left_14_0= ruleExpression )
                    // InternalMyDsl.g:1542:6: lv_left_14_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getBooleanExprAccess().getLeftExpressionParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_left_14_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBooleanExprRule());
                    						}
                    						set(
                    							current,
                    							"left",
                    							lv_left_14_0,
                    							"org.xtext.example.mydsl1.MyDsl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "entryRuleTimeSensors"
    // InternalMyDsl.g:1568:1: entryRuleTimeSensors returns [EObject current=null] : iv_ruleTimeSensors= ruleTimeSensors EOF ;
    public final EObject entryRuleTimeSensors() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeSensors = null;


        try {
            // InternalMyDsl.g:1568:52: (iv_ruleTimeSensors= ruleTimeSensors EOF )
            // InternalMyDsl.g:1569:2: iv_ruleTimeSensors= ruleTimeSensors EOF
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
    // InternalMyDsl.g:1575:1: ruleTimeSensors returns [EObject current=null] : ( () otherlv_1= 'TimeSensors' otherlv_2= '{' (otherlv_3= 'unit' ( (lv_unit_4_0= ruleEString ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
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
            // InternalMyDsl.g:1581:2: ( ( () otherlv_1= 'TimeSensors' otherlv_2= '{' (otherlv_3= 'unit' ( (lv_unit_4_0= ruleEString ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalMyDsl.g:1582:2: ( () otherlv_1= 'TimeSensors' otherlv_2= '{' (otherlv_3= 'unit' ( (lv_unit_4_0= ruleEString ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalMyDsl.g:1582:2: ( () otherlv_1= 'TimeSensors' otherlv_2= '{' (otherlv_3= 'unit' ( (lv_unit_4_0= ruleEString ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalMyDsl.g:1583:3: () otherlv_1= 'TimeSensors' otherlv_2= '{' (otherlv_3= 'unit' ( (lv_unit_4_0= ruleEString ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalMyDsl.g:1583:3: ()
            // InternalMyDsl.g:1584:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTimeSensorsAccess().getTimeSensorsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeSensorsAccess().getTimeSensorsKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getTimeSensorsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1598:3: (otherlv_3= 'unit' ( (lv_unit_4_0= ruleEString ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==19) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:1599:4: otherlv_3= 'unit' ( (lv_unit_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getTimeSensorsAccess().getUnitKeyword_3_0());
                    			
                    // InternalMyDsl.g:1603:4: ( (lv_unit_4_0= ruleEString ) )
                    // InternalMyDsl.g:1604:5: (lv_unit_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:1604:5: (lv_unit_4_0= ruleEString )
                    // InternalMyDsl.g:1605:6: lv_unit_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTimeSensorsAccess().getUnitEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_unit_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTimeSensorsRule());
                    						}
                    						set(
                    							current,
                    							"unit",
                    							lv_unit_4_0,
                    							"org.xtext.example.mydsl1.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1623:3: (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==40) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:1624:4: otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getTimeSensorsAccess().getNewvariableKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_35); 

                    				newLeafNode(otherlv_6, grammarAccess.getTimeSensorsAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyDsl.g:1632:4: ( (lv_newvariable_7_0= ruleVariableDeclaration ) )
                    // InternalMyDsl.g:1633:5: (lv_newvariable_7_0= ruleVariableDeclaration )
                    {
                    // InternalMyDsl.g:1633:5: (lv_newvariable_7_0= ruleVariableDeclaration )
                    // InternalMyDsl.g:1634:6: lv_newvariable_7_0= ruleVariableDeclaration
                    {

                    						newCompositeNode(grammarAccess.getTimeSensorsAccess().getNewvariableVariableDeclarationParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_newvariable_7_0=ruleVariableDeclaration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTimeSensorsRule());
                    						}
                    						add(
                    							current,
                    							"newvariable",
                    							lv_newvariable_7_0,
                    							"org.xtext.example.mydsl1.MyDsl.VariableDeclaration");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1651:4: (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==14) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalMyDsl.g:1652:5: otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_35); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getTimeSensorsAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:1656:5: ( (lv_newvariable_9_0= ruleVariableDeclaration ) )
                    	    // InternalMyDsl.g:1657:6: (lv_newvariable_9_0= ruleVariableDeclaration )
                    	    {
                    	    // InternalMyDsl.g:1657:6: (lv_newvariable_9_0= ruleVariableDeclaration )
                    	    // InternalMyDsl.g:1658:7: lv_newvariable_9_0= ruleVariableDeclaration
                    	    {

                    	    							newCompositeNode(grammarAccess.getTimeSensorsAccess().getNewvariableVariableDeclarationParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_newvariable_9_0=ruleVariableDeclaration();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTimeSensorsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"newvariable",
                    	    								lv_newvariable_9_0,
                    	    								"org.xtext.example.mydsl1.MyDsl.VariableDeclaration");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getTimeSensorsAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "entryRuleArithmeticExpr"
    // InternalMyDsl.g:1689:1: entryRuleArithmeticExpr returns [EObject current=null] : iv_ruleArithmeticExpr= ruleArithmeticExpr EOF ;
    public final EObject entryRuleArithmeticExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticExpr = null;


        try {
            // InternalMyDsl.g:1689:55: (iv_ruleArithmeticExpr= ruleArithmeticExpr EOF )
            // InternalMyDsl.g:1690:2: iv_ruleArithmeticExpr= ruleArithmeticExpr EOF
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
    // InternalMyDsl.g:1696:1: ruleArithmeticExpr returns [EObject current=null] : ( () otherlv_1= 'ArithmeticExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleOperator ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? (otherlv_11= 'left' ( (lv_left_12_0= ruleNumberExpr ) ) )? (otherlv_13= 'right' ( (lv_right_14_0= ruleNumberExpr ) ) )? otherlv_15= '}' ) ;
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
            // InternalMyDsl.g:1702:2: ( ( () otherlv_1= 'ArithmeticExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleOperator ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? (otherlv_11= 'left' ( (lv_left_12_0= ruleNumberExpr ) ) )? (otherlv_13= 'right' ( (lv_right_14_0= ruleNumberExpr ) ) )? otherlv_15= '}' ) )
            // InternalMyDsl.g:1703:2: ( () otherlv_1= 'ArithmeticExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleOperator ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? (otherlv_11= 'left' ( (lv_left_12_0= ruleNumberExpr ) ) )? (otherlv_13= 'right' ( (lv_right_14_0= ruleNumberExpr ) ) )? otherlv_15= '}' )
            {
            // InternalMyDsl.g:1703:2: ( () otherlv_1= 'ArithmeticExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleOperator ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? (otherlv_11= 'left' ( (lv_left_12_0= ruleNumberExpr ) ) )? (otherlv_13= 'right' ( (lv_right_14_0= ruleNumberExpr ) ) )? otherlv_15= '}' )
            // InternalMyDsl.g:1704:3: () otherlv_1= 'ArithmeticExpr' otherlv_2= '{' (otherlv_3= 'operator' ( (lv_operator_4_0= ruleOperator ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? (otherlv_11= 'left' ( (lv_left_12_0= ruleNumberExpr ) ) )? (otherlv_13= 'right' ( (lv_right_14_0= ruleNumberExpr ) ) )? otherlv_15= '}'
            {
            // InternalMyDsl.g:1704:3: ()
            // InternalMyDsl.g:1705:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArithmeticExprAccess().getArithmeticExprAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getArithmeticExprAccess().getArithmeticExprKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getArithmeticExprAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1719:3: (otherlv_3= 'operator' ( (lv_operator_4_0= ruleOperator ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==39) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:1720:4: otherlv_3= 'operator' ( (lv_operator_4_0= ruleOperator ) )
                    {
                    otherlv_3=(Token)match(input,39,FOLLOW_40); 

                    				newLeafNode(otherlv_3, grammarAccess.getArithmeticExprAccess().getOperatorKeyword_3_0());
                    			
                    // InternalMyDsl.g:1724:4: ( (lv_operator_4_0= ruleOperator ) )
                    // InternalMyDsl.g:1725:5: (lv_operator_4_0= ruleOperator )
                    {
                    // InternalMyDsl.g:1725:5: (lv_operator_4_0= ruleOperator )
                    // InternalMyDsl.g:1726:6: lv_operator_4_0= ruleOperator
                    {

                    						newCompositeNode(grammarAccess.getArithmeticExprAccess().getOperatorOperatorEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_operator_4_0=ruleOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArithmeticExprRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_4_0,
                    							"org.xtext.example.mydsl1.MyDsl.Operator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1744:3: (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==40) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMyDsl.g:1745:4: otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getArithmeticExprAccess().getNewvariableKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_35); 

                    				newLeafNode(otherlv_6, grammarAccess.getArithmeticExprAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyDsl.g:1753:4: ( (lv_newvariable_7_0= ruleVariableDeclaration ) )
                    // InternalMyDsl.g:1754:5: (lv_newvariable_7_0= ruleVariableDeclaration )
                    {
                    // InternalMyDsl.g:1754:5: (lv_newvariable_7_0= ruleVariableDeclaration )
                    // InternalMyDsl.g:1755:6: lv_newvariable_7_0= ruleVariableDeclaration
                    {

                    						newCompositeNode(grammarAccess.getArithmeticExprAccess().getNewvariableVariableDeclarationParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_newvariable_7_0=ruleVariableDeclaration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArithmeticExprRule());
                    						}
                    						add(
                    							current,
                    							"newvariable",
                    							lv_newvariable_7_0,
                    							"org.xtext.example.mydsl1.MyDsl.VariableDeclaration");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1772:4: (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==14) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalMyDsl.g:1773:5: otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_35); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getArithmeticExprAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:1777:5: ( (lv_newvariable_9_0= ruleVariableDeclaration ) )
                    	    // InternalMyDsl.g:1778:6: (lv_newvariable_9_0= ruleVariableDeclaration )
                    	    {
                    	    // InternalMyDsl.g:1778:6: (lv_newvariable_9_0= ruleVariableDeclaration )
                    	    // InternalMyDsl.g:1779:7: lv_newvariable_9_0= ruleVariableDeclaration
                    	    {

                    	    							newCompositeNode(grammarAccess.getArithmeticExprAccess().getNewvariableVariableDeclarationParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_newvariable_9_0=ruleVariableDeclaration();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getArithmeticExprRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"newvariable",
                    	    								lv_newvariable_9_0,
                    	    								"org.xtext.example.mydsl1.MyDsl.VariableDeclaration");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_36); 

                    				newLeafNode(otherlv_10, grammarAccess.getArithmeticExprAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1802:3: (otherlv_11= 'left' ( (lv_left_12_0= ruleNumberExpr ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==42) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMyDsl.g:1803:4: otherlv_11= 'left' ( (lv_left_12_0= ruleNumberExpr ) )
                    {
                    otherlv_11=(Token)match(input,42,FOLLOW_23); 

                    				newLeafNode(otherlv_11, grammarAccess.getArithmeticExprAccess().getLeftKeyword_5_0());
                    			
                    // InternalMyDsl.g:1807:4: ( (lv_left_12_0= ruleNumberExpr ) )
                    // InternalMyDsl.g:1808:5: (lv_left_12_0= ruleNumberExpr )
                    {
                    // InternalMyDsl.g:1808:5: (lv_left_12_0= ruleNumberExpr )
                    // InternalMyDsl.g:1809:6: lv_left_12_0= ruleNumberExpr
                    {

                    						newCompositeNode(grammarAccess.getArithmeticExprAccess().getLeftNumberExprParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_left_12_0=ruleNumberExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArithmeticExprRule());
                    						}
                    						set(
                    							current,
                    							"left",
                    							lv_left_12_0,
                    							"org.xtext.example.mydsl1.MyDsl.NumberExpr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1827:3: (otherlv_13= 'right' ( (lv_right_14_0= ruleNumberExpr ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==41) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMyDsl.g:1828:4: otherlv_13= 'right' ( (lv_right_14_0= ruleNumberExpr ) )
                    {
                    otherlv_13=(Token)match(input,41,FOLLOW_23); 

                    				newLeafNode(otherlv_13, grammarAccess.getArithmeticExprAccess().getRightKeyword_6_0());
                    			
                    // InternalMyDsl.g:1832:4: ( (lv_right_14_0= ruleNumberExpr ) )
                    // InternalMyDsl.g:1833:5: (lv_right_14_0= ruleNumberExpr )
                    {
                    // InternalMyDsl.g:1833:5: (lv_right_14_0= ruleNumberExpr )
                    // InternalMyDsl.g:1834:6: lv_right_14_0= ruleNumberExpr
                    {

                    						newCompositeNode(grammarAccess.getArithmeticExprAccess().getRightNumberExprParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_right_14_0=ruleNumberExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArithmeticExprRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_14_0,
                    							"org.xtext.example.mydsl1.MyDsl.NumberExpr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "entryRuleIntExpression"
    // InternalMyDsl.g:1860:1: entryRuleIntExpression returns [EObject current=null] : iv_ruleIntExpression= ruleIntExpression EOF ;
    public final EObject entryRuleIntExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntExpression = null;


        try {
            // InternalMyDsl.g:1860:54: (iv_ruleIntExpression= ruleIntExpression EOF )
            // InternalMyDsl.g:1861:2: iv_ruleIntExpression= ruleIntExpression EOF
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
    // InternalMyDsl.g:1867:1: ruleIntExpression returns [EObject current=null] : ( () otherlv_1= 'IntExpression' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
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
            // InternalMyDsl.g:1873:2: ( ( () otherlv_1= 'IntExpression' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalMyDsl.g:1874:2: ( () otherlv_1= 'IntExpression' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalMyDsl.g:1874:2: ( () otherlv_1= 'IntExpression' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalMyDsl.g:1875:3: () otherlv_1= 'IntExpression' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalMyDsl.g:1875:3: ()
            // InternalMyDsl.g:1876:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntExpressionAccess().getIntExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getIntExpressionAccess().getIntExpressionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_42); 

            			newLeafNode(otherlv_2, grammarAccess.getIntExpressionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1890:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==46) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMyDsl.g:1891:4: otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,46,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getIntExpressionAccess().getValueKeyword_3_0());
                    			
                    // InternalMyDsl.g:1895:4: ( (lv_value_4_0= ruleEInt ) )
                    // InternalMyDsl.g:1896:5: (lv_value_4_0= ruleEInt )
                    {
                    // InternalMyDsl.g:1896:5: (lv_value_4_0= ruleEInt )
                    // InternalMyDsl.g:1897:6: lv_value_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getIntExpressionAccess().getValueEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_value_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntExpressionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"org.xtext.example.mydsl1.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1915:3: (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==40) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMyDsl.g:1916:4: otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getIntExpressionAccess().getNewvariableKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_35); 

                    				newLeafNode(otherlv_6, grammarAccess.getIntExpressionAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyDsl.g:1924:4: ( (lv_newvariable_7_0= ruleVariableDeclaration ) )
                    // InternalMyDsl.g:1925:5: (lv_newvariable_7_0= ruleVariableDeclaration )
                    {
                    // InternalMyDsl.g:1925:5: (lv_newvariable_7_0= ruleVariableDeclaration )
                    // InternalMyDsl.g:1926:6: lv_newvariable_7_0= ruleVariableDeclaration
                    {

                    						newCompositeNode(grammarAccess.getIntExpressionAccess().getNewvariableVariableDeclarationParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_newvariable_7_0=ruleVariableDeclaration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntExpressionRule());
                    						}
                    						add(
                    							current,
                    							"newvariable",
                    							lv_newvariable_7_0,
                    							"org.xtext.example.mydsl1.MyDsl.VariableDeclaration");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1943:4: (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==14) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalMyDsl.g:1944:5: otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_35); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getIntExpressionAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:1948:5: ( (lv_newvariable_9_0= ruleVariableDeclaration ) )
                    	    // InternalMyDsl.g:1949:6: (lv_newvariable_9_0= ruleVariableDeclaration )
                    	    {
                    	    // InternalMyDsl.g:1949:6: (lv_newvariable_9_0= ruleVariableDeclaration )
                    	    // InternalMyDsl.g:1950:7: lv_newvariable_9_0= ruleVariableDeclaration
                    	    {

                    	    							newCompositeNode(grammarAccess.getIntExpressionAccess().getNewvariableVariableDeclarationParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_newvariable_9_0=ruleVariableDeclaration();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIntExpressionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"newvariable",
                    	    								lv_newvariable_9_0,
                    	    								"org.xtext.example.mydsl1.MyDsl.VariableDeclaration");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getIntExpressionAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

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
    // InternalMyDsl.g:1981:1: entryRuleBoolean returns [EObject current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final EObject entryRuleBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolean = null;


        try {
            // InternalMyDsl.g:1981:48: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalMyDsl.g:1982:2: iv_ruleBoolean= ruleBoolean EOF
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
    // InternalMyDsl.g:1988:1: ruleBoolean returns [EObject current=null] : ( () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'Boolean' otherlv_3= '{' (otherlv_4= 'newvariable' otherlv_5= '{' ( (lv_newvariable_6_0= ruleVariableDeclaration ) ) (otherlv_7= ',' ( (lv_newvariable_8_0= ruleVariableDeclaration ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
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
            // InternalMyDsl.g:1994:2: ( ( () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'Boolean' otherlv_3= '{' (otherlv_4= 'newvariable' otherlv_5= '{' ( (lv_newvariable_6_0= ruleVariableDeclaration ) ) (otherlv_7= ',' ( (lv_newvariable_8_0= ruleVariableDeclaration ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalMyDsl.g:1995:2: ( () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'Boolean' otherlv_3= '{' (otherlv_4= 'newvariable' otherlv_5= '{' ( (lv_newvariable_6_0= ruleVariableDeclaration ) ) (otherlv_7= ',' ( (lv_newvariable_8_0= ruleVariableDeclaration ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalMyDsl.g:1995:2: ( () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'Boolean' otherlv_3= '{' (otherlv_4= 'newvariable' otherlv_5= '{' ( (lv_newvariable_6_0= ruleVariableDeclaration ) ) (otherlv_7= ',' ( (lv_newvariable_8_0= ruleVariableDeclaration ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalMyDsl.g:1996:3: () ( (lv_value_1_0= 'value' ) )? otherlv_2= 'Boolean' otherlv_3= '{' (otherlv_4= 'newvariable' otherlv_5= '{' ( (lv_newvariable_6_0= ruleVariableDeclaration ) ) (otherlv_7= ',' ( (lv_newvariable_8_0= ruleVariableDeclaration ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalMyDsl.g:1996:3: ()
            // InternalMyDsl.g:1997:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanAccess().getBooleanAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:2003:3: ( (lv_value_1_0= 'value' ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==46) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMyDsl.g:2004:4: (lv_value_1_0= 'value' )
                    {
                    // InternalMyDsl.g:2004:4: (lv_value_1_0= 'value' )
                    // InternalMyDsl.g:2005:5: lv_value_1_0= 'value'
                    {
                    lv_value_1_0=(Token)match(input,46,FOLLOW_43); 

                    					newLeafNode(lv_value_1_0, grammarAccess.getBooleanAccess().getValueValueKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_1_0 != null, "value");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getBooleanAccess().getBooleanKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getBooleanAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:2025:3: (otherlv_4= 'newvariable' otherlv_5= '{' ( (lv_newvariable_6_0= ruleVariableDeclaration ) ) (otherlv_7= ',' ( (lv_newvariable_8_0= ruleVariableDeclaration ) ) )* otherlv_9= '}' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==40) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalMyDsl.g:2026:4: otherlv_4= 'newvariable' otherlv_5= '{' ( (lv_newvariable_6_0= ruleVariableDeclaration ) ) (otherlv_7= ',' ( (lv_newvariable_8_0= ruleVariableDeclaration ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getBooleanAccess().getNewvariableKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_35); 

                    				newLeafNode(otherlv_5, grammarAccess.getBooleanAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyDsl.g:2034:4: ( (lv_newvariable_6_0= ruleVariableDeclaration ) )
                    // InternalMyDsl.g:2035:5: (lv_newvariable_6_0= ruleVariableDeclaration )
                    {
                    // InternalMyDsl.g:2035:5: (lv_newvariable_6_0= ruleVariableDeclaration )
                    // InternalMyDsl.g:2036:6: lv_newvariable_6_0= ruleVariableDeclaration
                    {

                    						newCompositeNode(grammarAccess.getBooleanAccess().getNewvariableVariableDeclarationParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_newvariable_6_0=ruleVariableDeclaration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBooleanRule());
                    						}
                    						add(
                    							current,
                    							"newvariable",
                    							lv_newvariable_6_0,
                    							"org.xtext.example.mydsl1.MyDsl.VariableDeclaration");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:2053:4: (otherlv_7= ',' ( (lv_newvariable_8_0= ruleVariableDeclaration ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==14) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalMyDsl.g:2054:5: otherlv_7= ',' ( (lv_newvariable_8_0= ruleVariableDeclaration ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_35); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getBooleanAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:2058:5: ( (lv_newvariable_8_0= ruleVariableDeclaration ) )
                    	    // InternalMyDsl.g:2059:6: (lv_newvariable_8_0= ruleVariableDeclaration )
                    	    {
                    	    // InternalMyDsl.g:2059:6: (lv_newvariable_8_0= ruleVariableDeclaration )
                    	    // InternalMyDsl.g:2060:7: lv_newvariable_8_0= ruleVariableDeclaration
                    	    {

                    	    							newCompositeNode(grammarAccess.getBooleanAccess().getNewvariableVariableDeclarationParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_newvariable_8_0=ruleVariableDeclaration();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBooleanRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"newvariable",
                    	    								lv_newvariable_8_0,
                    	    								"org.xtext.example.mydsl1.MyDsl.VariableDeclaration");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getBooleanAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

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
    // InternalMyDsl.g:2091:1: entryRuleDistanceSensor returns [EObject current=null] : iv_ruleDistanceSensor= ruleDistanceSensor EOF ;
    public final EObject entryRuleDistanceSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistanceSensor = null;


        try {
            // InternalMyDsl.g:2091:55: (iv_ruleDistanceSensor= ruleDistanceSensor EOF )
            // InternalMyDsl.g:2092:2: iv_ruleDistanceSensor= ruleDistanceSensor EOF
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
    // InternalMyDsl.g:2098:1: ruleDistanceSensor returns [EObject current=null] : ( () otherlv_1= 'DistanceSensor' otherlv_2= '{' (otherlv_3= 'unit' ( (lv_unit_4_0= ruleEString ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
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
            // InternalMyDsl.g:2104:2: ( ( () otherlv_1= 'DistanceSensor' otherlv_2= '{' (otherlv_3= 'unit' ( (lv_unit_4_0= ruleEString ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalMyDsl.g:2105:2: ( () otherlv_1= 'DistanceSensor' otherlv_2= '{' (otherlv_3= 'unit' ( (lv_unit_4_0= ruleEString ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalMyDsl.g:2105:2: ( () otherlv_1= 'DistanceSensor' otherlv_2= '{' (otherlv_3= 'unit' ( (lv_unit_4_0= ruleEString ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalMyDsl.g:2106:3: () otherlv_1= 'DistanceSensor' otherlv_2= '{' (otherlv_3= 'unit' ( (lv_unit_4_0= ruleEString ) ) )? (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalMyDsl.g:2106:3: ()
            // InternalMyDsl.g:2107:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDistanceSensorAccess().getDistanceSensorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDistanceSensorAccess().getDistanceSensorKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getDistanceSensorAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:2121:3: (otherlv_3= 'unit' ( (lv_unit_4_0= ruleEString ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==19) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalMyDsl.g:2122:4: otherlv_3= 'unit' ( (lv_unit_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getDistanceSensorAccess().getUnitKeyword_3_0());
                    			
                    // InternalMyDsl.g:2126:4: ( (lv_unit_4_0= ruleEString ) )
                    // InternalMyDsl.g:2127:5: (lv_unit_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:2127:5: (lv_unit_4_0= ruleEString )
                    // InternalMyDsl.g:2128:6: lv_unit_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDistanceSensorAccess().getUnitEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_unit_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDistanceSensorRule());
                    						}
                    						set(
                    							current,
                    							"unit",
                    							lv_unit_4_0,
                    							"org.xtext.example.mydsl1.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2146:3: (otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==40) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMyDsl.g:2147:4: otherlv_5= 'newvariable' otherlv_6= '{' ( (lv_newvariable_7_0= ruleVariableDeclaration ) ) (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getDistanceSensorAccess().getNewvariableKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_35); 

                    				newLeafNode(otherlv_6, grammarAccess.getDistanceSensorAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyDsl.g:2155:4: ( (lv_newvariable_7_0= ruleVariableDeclaration ) )
                    // InternalMyDsl.g:2156:5: (lv_newvariable_7_0= ruleVariableDeclaration )
                    {
                    // InternalMyDsl.g:2156:5: (lv_newvariable_7_0= ruleVariableDeclaration )
                    // InternalMyDsl.g:2157:6: lv_newvariable_7_0= ruleVariableDeclaration
                    {

                    						newCompositeNode(grammarAccess.getDistanceSensorAccess().getNewvariableVariableDeclarationParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_newvariable_7_0=ruleVariableDeclaration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDistanceSensorRule());
                    						}
                    						add(
                    							current,
                    							"newvariable",
                    							lv_newvariable_7_0,
                    							"org.xtext.example.mydsl1.MyDsl.VariableDeclaration");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:2174:4: (otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==14) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalMyDsl.g:2175:5: otherlv_8= ',' ( (lv_newvariable_9_0= ruleVariableDeclaration ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_35); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getDistanceSensorAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:2179:5: ( (lv_newvariable_9_0= ruleVariableDeclaration ) )
                    	    // InternalMyDsl.g:2180:6: (lv_newvariable_9_0= ruleVariableDeclaration )
                    	    {
                    	    // InternalMyDsl.g:2180:6: (lv_newvariable_9_0= ruleVariableDeclaration )
                    	    // InternalMyDsl.g:2181:7: lv_newvariable_9_0= ruleVariableDeclaration
                    	    {

                    	    							newCompositeNode(grammarAccess.getDistanceSensorAccess().getNewvariableVariableDeclarationParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_newvariable_9_0=ruleVariableDeclaration();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDistanceSensorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"newvariable",
                    	    								lv_newvariable_9_0,
                    	    								"org.xtext.example.mydsl1.MyDsl.VariableDeclaration");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getDistanceSensorAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "entryRuleReturnType"
    // InternalMyDsl.g:2212:1: entryRuleReturnType returns [EObject current=null] : iv_ruleReturnType= ruleReturnType EOF ;
    public final EObject entryRuleReturnType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnType = null;


        try {
            // InternalMyDsl.g:2212:51: (iv_ruleReturnType= ruleReturnType EOF )
            // InternalMyDsl.g:2213:2: iv_ruleReturnType= ruleReturnType EOF
            {
             newCompositeNode(grammarAccess.getReturnTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReturnType=ruleReturnType();

            state._fsp--;

             current =iv_ruleReturnType; 
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
    // $ANTLR end "entryRuleReturnType"


    // $ANTLR start "ruleReturnType"
    // InternalMyDsl.g:2219:1: ruleReturnType returns [EObject current=null] : ( () otherlv_1= 'ReturnType' otherlv_2= '{' (otherlv_3= 'returnType' ( (lv_returnType_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleReturnType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_returnType_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2225:2: ( ( () otherlv_1= 'ReturnType' otherlv_2= '{' (otherlv_3= 'returnType' ( (lv_returnType_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalMyDsl.g:2226:2: ( () otherlv_1= 'ReturnType' otherlv_2= '{' (otherlv_3= 'returnType' ( (lv_returnType_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalMyDsl.g:2226:2: ( () otherlv_1= 'ReturnType' otherlv_2= '{' (otherlv_3= 'returnType' ( (lv_returnType_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalMyDsl.g:2227:3: () otherlv_1= 'ReturnType' otherlv_2= '{' (otherlv_3= 'returnType' ( (lv_returnType_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalMyDsl.g:2227:3: ()
            // InternalMyDsl.g:2228:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReturnTypeAccess().getReturnTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getReturnTypeAccess().getReturnTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_44); 

            			newLeafNode(otherlv_2, grammarAccess.getReturnTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:2242:3: (otherlv_3= 'returnType' ( (lv_returnType_4_0= ruleEString ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==50) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalMyDsl.g:2243:4: otherlv_3= 'returnType' ( (lv_returnType_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,50,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getReturnTypeAccess().getReturnTypeKeyword_3_0());
                    			
                    // InternalMyDsl.g:2247:4: ( (lv_returnType_4_0= ruleEString ) )
                    // InternalMyDsl.g:2248:5: (lv_returnType_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:2248:5: (lv_returnType_4_0= ruleEString )
                    // InternalMyDsl.g:2249:6: lv_returnType_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getReturnTypeAccess().getReturnTypeEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_returnType_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReturnTypeRule());
                    						}
                    						set(
                    							current,
                    							"returnType",
                    							lv_returnType_4_0,
                    							"org.xtext.example.mydsl1.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getReturnTypeAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleReturnType"


    // $ANTLR start "entryRuleParameter"
    // InternalMyDsl.g:2275:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalMyDsl.g:2275:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalMyDsl.g:2276:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalMyDsl.g:2282:1: ruleParameter returns [EObject current=null] : ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= ruleEInt ) ) )? (otherlv_8= 'unit' ( (lv_unit_9_0= ruleEString ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_value_7_0 = null;

        AntlrDatatypeRuleToken lv_unit_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2288:2: ( ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= ruleEInt ) ) )? (otherlv_8= 'unit' ( (lv_unit_9_0= ruleEString ) ) )? otherlv_10= '}' ) )
            // InternalMyDsl.g:2289:2: ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= ruleEInt ) ) )? (otherlv_8= 'unit' ( (lv_unit_9_0= ruleEString ) ) )? otherlv_10= '}' )
            {
            // InternalMyDsl.g:2289:2: ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= ruleEInt ) ) )? (otherlv_8= 'unit' ( (lv_unit_9_0= ruleEString ) ) )? otherlv_10= '}' )
            // InternalMyDsl.g:2290:3: () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= ruleEInt ) ) )? (otherlv_8= 'unit' ( (lv_unit_9_0= ruleEString ) ) )? otherlv_10= '}'
            {
            // InternalMyDsl.g:2290:3: ()
            // InternalMyDsl.g:2291:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,51,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getParameterKeyword_1());
            		
            // InternalMyDsl.g:2301:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:2302:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:2302:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:2303:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl1.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_45); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:2324:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==31) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalMyDsl.g:2325:4: otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getTypeKeyword_4_0());
                    			
                    // InternalMyDsl.g:2329:4: ( (lv_type_5_0= ruleEString ) )
                    // InternalMyDsl.g:2330:5: (lv_type_5_0= ruleEString )
                    {
                    // InternalMyDsl.g:2330:5: (lv_type_5_0= ruleEString )
                    // InternalMyDsl.g:2331:6: lv_type_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getTypeEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_46);
                    lv_type_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"org.xtext.example.mydsl1.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2349:3: (otherlv_6= 'value' ( (lv_value_7_0= ruleEInt ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==46) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalMyDsl.g:2350:4: otherlv_6= 'value' ( (lv_value_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,46,FOLLOW_11); 

                    				newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getValueKeyword_5_0());
                    			
                    // InternalMyDsl.g:2354:4: ( (lv_value_7_0= ruleEInt ) )
                    // InternalMyDsl.g:2355:5: (lv_value_7_0= ruleEInt )
                    {
                    // InternalMyDsl.g:2355:5: (lv_value_7_0= ruleEInt )
                    // InternalMyDsl.g:2356:6: lv_value_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getValueEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_value_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_7_0,
                    							"org.xtext.example.mydsl1.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2374:3: (otherlv_8= 'unit' ( (lv_unit_9_0= ruleEString ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==19) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalMyDsl.g:2375:4: otherlv_8= 'unit' ( (lv_unit_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getParameterAccess().getUnitKeyword_6_0());
                    			
                    // InternalMyDsl.g:2379:4: ( (lv_unit_9_0= ruleEString ) )
                    // InternalMyDsl.g:2380:5: (lv_unit_9_0= ruleEString )
                    {
                    // InternalMyDsl.g:2380:5: (lv_unit_9_0= ruleEString )
                    // InternalMyDsl.g:2381:6: lv_unit_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getUnitEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_unit_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"unit",
                    							lv_unit_9_0,
                    							"org.xtext.example.mydsl1.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "ruleDirection"
    // InternalMyDsl.g:2407:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'Front' ) | (enumLiteral_1= 'Back' ) | (enumLiteral_2= 'Right' ) | (enumLiteral_3= 'Left' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2413:2: ( ( (enumLiteral_0= 'Front' ) | (enumLiteral_1= 'Back' ) | (enumLiteral_2= 'Right' ) | (enumLiteral_3= 'Left' ) ) )
            // InternalMyDsl.g:2414:2: ( (enumLiteral_0= 'Front' ) | (enumLiteral_1= 'Back' ) | (enumLiteral_2= 'Right' ) | (enumLiteral_3= 'Left' ) )
            {
            // InternalMyDsl.g:2414:2: ( (enumLiteral_0= 'Front' ) | (enumLiteral_1= 'Back' ) | (enumLiteral_2= 'Right' ) | (enumLiteral_3= 'Left' ) )
            int alt57=4;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt57=1;
                }
                break;
            case 53:
                {
                alt57=2;
                }
                break;
            case 54:
                {
                alt57=3;
                }
                break;
            case 55:
                {
                alt57=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalMyDsl.g:2415:3: (enumLiteral_0= 'Front' )
                    {
                    // InternalMyDsl.g:2415:3: (enumLiteral_0= 'Front' )
                    // InternalMyDsl.g:2416:4: enumLiteral_0= 'Front'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getFrontEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getFrontEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2423:3: (enumLiteral_1= 'Back' )
                    {
                    // InternalMyDsl.g:2423:3: (enumLiteral_1= 'Back' )
                    // InternalMyDsl.g:2424:4: enumLiteral_1= 'Back'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getBackEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getBackEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2431:3: (enumLiteral_2= 'Right' )
                    {
                    // InternalMyDsl.g:2431:3: (enumLiteral_2= 'Right' )
                    // InternalMyDsl.g:2432:4: enumLiteral_2= 'Right'
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getRightEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDirectionAccess().getRightEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2439:3: (enumLiteral_3= 'Left' )
                    {
                    // InternalMyDsl.g:2439:3: (enumLiteral_3= 'Left' )
                    // InternalMyDsl.g:2440:4: enumLiteral_3= 'Left'
                    {
                    enumLiteral_3=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getLeftEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDirectionAccess().getLeftEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleDirection"


    // $ANTLR start "ruleAngleUnit"
    // InternalMyDsl.g:2450:1: ruleAngleUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'Degre' ) | (enumLiteral_1= 'Radian' ) ) ;
    public final Enumerator ruleAngleUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2456:2: ( ( (enumLiteral_0= 'Degre' ) | (enumLiteral_1= 'Radian' ) ) )
            // InternalMyDsl.g:2457:2: ( (enumLiteral_0= 'Degre' ) | (enumLiteral_1= 'Radian' ) )
            {
            // InternalMyDsl.g:2457:2: ( (enumLiteral_0= 'Degre' ) | (enumLiteral_1= 'Radian' ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==56) ) {
                alt58=1;
            }
            else if ( (LA58_0==57) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalMyDsl.g:2458:3: (enumLiteral_0= 'Degre' )
                    {
                    // InternalMyDsl.g:2458:3: (enumLiteral_0= 'Degre' )
                    // InternalMyDsl.g:2459:4: enumLiteral_0= 'Degre'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getAngleUnitAccess().getDegreEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAngleUnitAccess().getDegreEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2466:3: (enumLiteral_1= 'Radian' )
                    {
                    // InternalMyDsl.g:2466:3: (enumLiteral_1= 'Radian' )
                    // InternalMyDsl.g:2467:4: enumLiteral_1= 'Radian'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getAngleUnitAccess().getRadianEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAngleUnitAccess().getRadianEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleAngleUnit"


    // $ANTLR start "ruleBooleanOperator"
    // InternalMyDsl.g:2477:1: ruleBooleanOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'NOT' ) | (enumLiteral_3= 'EQUALS' ) | (enumLiteral_4= 'LESS' ) | (enumLiteral_5= 'GREATER' ) ) ;
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
            // InternalMyDsl.g:2483:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'NOT' ) | (enumLiteral_3= 'EQUALS' ) | (enumLiteral_4= 'LESS' ) | (enumLiteral_5= 'GREATER' ) ) )
            // InternalMyDsl.g:2484:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'NOT' ) | (enumLiteral_3= 'EQUALS' ) | (enumLiteral_4= 'LESS' ) | (enumLiteral_5= 'GREATER' ) )
            {
            // InternalMyDsl.g:2484:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'NOT' ) | (enumLiteral_3= 'EQUALS' ) | (enumLiteral_4= 'LESS' ) | (enumLiteral_5= 'GREATER' ) )
            int alt59=6;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt59=1;
                }
                break;
            case 59:
                {
                alt59=2;
                }
                break;
            case 60:
                {
                alt59=3;
                }
                break;
            case 61:
                {
                alt59=4;
                }
                break;
            case 62:
                {
                alt59=5;
                }
                break;
            case 63:
                {
                alt59=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // InternalMyDsl.g:2485:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalMyDsl.g:2485:3: (enumLiteral_0= 'AND' )
                    // InternalMyDsl.g:2486:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getBooleanOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBooleanOperatorAccess().getANDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2493:3: (enumLiteral_1= 'OR' )
                    {
                    // InternalMyDsl.g:2493:3: (enumLiteral_1= 'OR' )
                    // InternalMyDsl.g:2494:4: enumLiteral_1= 'OR'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getBooleanOperatorAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBooleanOperatorAccess().getOREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2501:3: (enumLiteral_2= 'NOT' )
                    {
                    // InternalMyDsl.g:2501:3: (enumLiteral_2= 'NOT' )
                    // InternalMyDsl.g:2502:4: enumLiteral_2= 'NOT'
                    {
                    enumLiteral_2=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getBooleanOperatorAccess().getNOTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBooleanOperatorAccess().getNOTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2509:3: (enumLiteral_3= 'EQUALS' )
                    {
                    // InternalMyDsl.g:2509:3: (enumLiteral_3= 'EQUALS' )
                    // InternalMyDsl.g:2510:4: enumLiteral_3= 'EQUALS'
                    {
                    enumLiteral_3=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getBooleanOperatorAccess().getEQUALSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBooleanOperatorAccess().getEQUALSEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:2517:3: (enumLiteral_4= 'LESS' )
                    {
                    // InternalMyDsl.g:2517:3: (enumLiteral_4= 'LESS' )
                    // InternalMyDsl.g:2518:4: enumLiteral_4= 'LESS'
                    {
                    enumLiteral_4=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getBooleanOperatorAccess().getLESSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getBooleanOperatorAccess().getLESSEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:2525:3: (enumLiteral_5= 'GREATER' )
                    {
                    // InternalMyDsl.g:2525:3: (enumLiteral_5= 'GREATER' )
                    // InternalMyDsl.g:2526:4: enumLiteral_5= 'GREATER'
                    {
                    enumLiteral_5=(Token)match(input,63,FOLLOW_2); 

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


    // $ANTLR start "ruleOperator"
    // InternalMyDsl.g:2536:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'ADD' ) | (enumLiteral_1= 'SUB' ) | (enumLiteral_2= 'MUL' ) | (enumLiteral_3= 'DIV' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2542:2: ( ( (enumLiteral_0= 'ADD' ) | (enumLiteral_1= 'SUB' ) | (enumLiteral_2= 'MUL' ) | (enumLiteral_3= 'DIV' ) ) )
            // InternalMyDsl.g:2543:2: ( (enumLiteral_0= 'ADD' ) | (enumLiteral_1= 'SUB' ) | (enumLiteral_2= 'MUL' ) | (enumLiteral_3= 'DIV' ) )
            {
            // InternalMyDsl.g:2543:2: ( (enumLiteral_0= 'ADD' ) | (enumLiteral_1= 'SUB' ) | (enumLiteral_2= 'MUL' ) | (enumLiteral_3= 'DIV' ) )
            int alt60=4;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt60=1;
                }
                break;
            case 65:
                {
                alt60=2;
                }
                break;
            case 66:
                {
                alt60=3;
                }
                break;
            case 67:
                {
                alt60=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // InternalMyDsl.g:2544:3: (enumLiteral_0= 'ADD' )
                    {
                    // InternalMyDsl.g:2544:3: (enumLiteral_0= 'ADD' )
                    // InternalMyDsl.g:2545:4: enumLiteral_0= 'ADD'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getADDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2552:3: (enumLiteral_1= 'SUB' )
                    {
                    // InternalMyDsl.g:2552:3: (enumLiteral_1= 'SUB' )
                    // InternalMyDsl.g:2553:4: enumLiteral_1= 'SUB'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getSUBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getSUBEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2560:3: (enumLiteral_2= 'MUL' )
                    {
                    // InternalMyDsl.g:2560:3: (enumLiteral_2= 'MUL' )
                    // InternalMyDsl.g:2561:4: enumLiteral_2= 'MUL'
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getMULEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperatorAccess().getMULEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2568:3: (enumLiteral_3= 'DIV' )
                    {
                    // InternalMyDsl.g:2568:3: (enumLiteral_3= 'DIV' )
                    // InternalMyDsl.g:2569:4: enumLiteral_3= 'DIV'
                    {
                    enumLiteral_3=(Token)match(input,67,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000549510000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000E8000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00F0000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C8000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000080A000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000006808000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004808000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000030008000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020008000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0001F84000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000A0008000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000020000A000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200008000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001800008000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000008000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000078000008000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0xFC00000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000070000008000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000060000008000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040000008000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010000088000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000010000008000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000020000008000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000410000008000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0004000000008000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000400080088000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000400000088000L});

}