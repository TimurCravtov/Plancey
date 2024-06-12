import React, { useState } from 'react';
import ReactMarkdown from 'react-markdown';
import "./NewPost.css"
import RemarkMathPlugin from 'remark-math';

const NewPost = () => {
    const [markdown, setMarkdown] = useState('');

    const handleMarkdownChange = (e) => {
        setMarkdown(e.target.value);
    };

    const handleSave = () => {
        console.log(markdown);
    }

    return (
        <div className="container">
      <textarea
          className="markdown-input"
          value={markdown}
          onChange={handleMarkdownChange}
          placeholder="Write your note here..."
      />
            <div className="markdown-preview">
                <ReactMarkdown remarkPlugins={RemarkMathPlugin}>{markdown}</ReactMarkdown>
            </div>
            <div>
                <button onClick={handleSave}>Save</button>
            </div>
        </div>
    );
};

export default NewPost;
