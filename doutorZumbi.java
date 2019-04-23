// -------------Usado pelo paciente---------------
public interface IResponder{
  public String ask(String question);
  public boolean finalAnswer(String answer);
}

// -------------Usado pelo doutor-----------------
public interface IResponderReceptacle{
  public void connect(IResponder responder);
}

public interface IEnquirer{
  public void startInterview()
}
//-------------------------------------------------
qualquer coisa
