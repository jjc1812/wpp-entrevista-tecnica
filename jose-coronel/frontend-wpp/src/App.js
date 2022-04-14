import React, { useState } from 'react';
import { sendMessageService } from './Service';
import {useDispatch} from "react-redux";

function App() {

  const [sendMessage, setSendMessage] = useState('')
  const [getMessage, setGetMessage] = useState('')
  const dispatch = useDispatch;

  const styles = {
    sendBtn: {
      color: "blue",
      cursor: "pointer",
      "&:hover": {
        color: "gray",
      },
    }
  };

  const onChanged = e => setSendMessage(e.target.value)

  const submitMessage = () => {
    dispatch((sendMessageService("PED"))).then(result => setGetMessage(result))
    setSendMessage("")
  }

  return (
      <>
        <div className="container">
          <text>{getMessage}</text>
        </div>

        <div className="container">
          <form>
            <div className="form-group">
              <input className="form-control" placeholder='mensaje' onChange={event => onChanged(event)}/>
              <button className={styles.sendBtn} onClick={submitMessage}>Enviar</button>
            </div>
          </form>
        </div>
      </>
  );
}

export default App;
